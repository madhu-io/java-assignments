package CircularLinkedList;

class DFMain {

    public static Node DeletionFirst(Node head) {

        if (head == null) {
            return null;
        }

        if (head.next == head) {
            return null;
        }

        Node curr = head;

        while (curr.next != head) {
            curr = curr.next;
        }

        head = head.next;
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
        head.next.next.next = head;

        System.out.println("Before deletion:");
        printList(head);

        head = DeletionFirst(head);

        System.out.println("After deletion at first:");
        printList(head);
    }
}