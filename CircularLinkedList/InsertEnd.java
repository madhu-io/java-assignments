package CircularLinkedList;

class IEMain {

    public static Node InsertEnd(Node head, int data) {

        Node newNode = new Node(data);

        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }

        Node curr = head;

        while (curr.next != head) {
            curr = curr.next;
        }

        curr.next = newNode;
        newNode.next = head;

        return head;
    }

    public static void printList(Node head) {

        if (head == null) {
            return;
        }

        Node curr = head;

        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != head);

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(1);

        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;

        System.out.println("Before insertion:");
        printList(head);

        head = InsertEnd(head, 4);

        System.out.println("After insertion at end:");
        printList(head);
    }
}