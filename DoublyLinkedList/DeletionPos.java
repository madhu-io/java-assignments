package DoublyLinkedList;


 class PMain {

    public static Node DeletionPos(Node head, int x) {

        if (head == null) {
            return head;
        }

        Node curr = head;

        for (int i = 1; curr != null && i < x; i++) {
            curr = curr.next;
        }

        if (curr == null) {
            return head;
        }

        if (curr.prev != null) {
            curr.prev.next = curr.next;
        } else {
            head = curr.next;
        }

        if (curr.next != null) {
            curr.next.prev = curr.prev;
        }

        return head;
    }

    public static void printList(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data);

            if (curr.next != null) {
                System.out.print(" <-> ");
            }

            curr = curr.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;
        head.next.next = new Node(30);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(40);
        head.next.next.next.prev = head.next.next;

        System.out.println("Before deletion:");
        printList(head);

        head = DeletionPos(head, 2);

        System.out.println("After deletion:");
        printList(head);
    }
}