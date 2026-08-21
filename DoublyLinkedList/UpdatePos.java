package DoublyLinkedList;

public class UpdatePos {

    public static Node updatePos(Node head, int pos, int newData) {

        if (head == null) {
            return head;
        }
        Node curr = head;

        for (int i = 1; curr != null && i < pos; i++) {
            curr = curr.next;
        }
        if (curr == null) {
            return head;
        }
        curr.data = newData;
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
        System.out.println("Before Update:");
        printList(head);
        head = updatePos(head, 2, 200);
        System.out.println("After Update:");
        printList(head);
    }}