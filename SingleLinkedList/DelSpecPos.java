class DSMain {
    static class DSNode {
        int data;
        DSNode next;
        DSNode(int x) {
            this.data = x;
            this.next = null;
        }
    }

    static DSNode deleteAtPosition(DSNode head, int pos) {
        if (head == null) return null;

        if (pos == 1) {
            return head.next;
        }

        DSNode current = head;
        for (int i = 1; current != null && i < pos - 1; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            return head;
        }

        current.next = current.next.next;
        return head;
    }

    static void printList(DSNode head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DSNode head = new DSNode(1);
        head.next = new DSNode(2);
        head.next.next = new DSNode(3);
        head.next.next.next = new DSNode(4);
        head.next.next.next.next = new DSNode(5);

        System.out.println("Original List:");
        printList(head);

        head = deleteAtPosition(head, 3);

        System.out.println("After deleting position :");
        printList(head);
    }
}
