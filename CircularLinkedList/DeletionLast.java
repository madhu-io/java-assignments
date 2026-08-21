package CircularLinkedList;

class DLMain {

    public static Node DeletionLast(Node head) {

        if (head == null) {
            return null;
        }

        if (head.next == head) {
            return null;
        }

        Node curr = head;

        while (curr.next.next != head) {
            curr = curr.next;
        }

        curr.next = head;

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

        Node head = new Node(10);

        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;

        System.out.println("Before deletion:");
        printList(head);

        head = DeletionLast(head);

        System.out.println("After deletion at last:");
        printList(head);
    }
}