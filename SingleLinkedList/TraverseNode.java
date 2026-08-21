public class TraverseNode {
    // Traverse and print all elements in the list
    public static void traverse(Node head) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        traverse(head);
    }
}