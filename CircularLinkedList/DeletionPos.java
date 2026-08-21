package CircularLinkedList;

class DPMain {

    public static Node DeletionPos(Node head, int pos) {

        if (head == null) {
            return null;
        }

        if (pos == 1) {

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

        Node curr = head;

        for (int i = 1; i < pos - 1; i++) {

            curr = curr.next;

            if (curr == head) {
                return head;
            }
        }

        Node temp = curr.next;

        if (temp == head) {
            return head;
        }

        curr.next = temp.next;

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

        head = DeletionPos(head, 2);

        System.out.println("After deletion:");
        printList(head);
    }
}