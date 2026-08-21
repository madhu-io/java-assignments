package CircularLinkedList;

class IFMain {

    public static Node InsertAtFirst(Node head, int data) {

        Node newNode = new Node(data);

        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }

        Node curr = head;

        while (curr.next != head) {
            curr = curr.next;
        }

        newNode.next = head;
        curr.next = newNode;

        return newNode;
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

        Node head = new Node(2);

        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = head;

        System.out.println("Before insertion:");
        printList(head);

        head = InsertAtFirst(head, 1);

        System.out.println("After insertion at first:");
        printList(head);
    }
}