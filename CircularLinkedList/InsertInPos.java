package CircularLinkedList;

class IPMain {

    public static Node InsertInPos(Node head, int pos, int data) {

        Node newNode = new Node(data);

        if (head == null) {
            if (pos == 1) {
                newNode.next = newNode;
                return newNode;
            }
            return head;
        }

        if (pos == 1) {

            Node curr = head;

            while (curr.next != head) {
                curr = curr.next;
            }

            newNode.next = head;
            curr.next = newNode;

            return newNode;
        }

        Node curr = head;

        for (int i = 1; i < pos - 1; i++) {

            curr = curr.next;

            if (curr == head) {
                return head;
            }
        }

        newNode.next = curr.next;
        curr.next = newNode;

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

        System.out.println("Before insertion:");
        printList(head);

        head = InsertInPos(head, 3, 25);

        System.out.println("After insertion:");
        printList(head);
    }
}