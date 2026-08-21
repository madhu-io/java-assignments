package CircularLinkedList;

class UPMain {

    public static Node UpdatePos(Node head, int pos, int newData) {

        if (head == null) {
            return head;
        }
        Node curr = head;
        for (int i = 1; i < pos; i++) {

            curr = curr.next;

            if (curr == head) {
                return head;
            }
        }
        curr.data = newData;

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

        System.out.println("Before Update:");
        printList(head);

        head = UpdatePos(head, 2, 200);

        System.out.println("After Update:");
        printList(head);
    }
}