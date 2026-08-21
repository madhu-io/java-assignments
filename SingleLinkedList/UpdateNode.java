public class UpdateNode {
    public static boolean UpdateNode(Node head, int position, int newValue) {
        if (head == null || position <= 0) {
            return false;
        }

        Node temp = head;
        int currentPos = 1;

        while (temp != null && currentPos < position) {
            temp = temp.next;
            currentPos++;
        }

        if (temp != null) {
            temp.data = newValue; // Update data
            return true;
        }

        return false; // Position out of bounds
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        int posToUpdate = 2;
        int newValue = 25;

        boolean success = UpdateNode(head, posToUpdate, newValue);

        if (success) {
            System.out.println("Node at position " + posToUpdate + " updated to " + newValue);
        } else {
            System.out.println("Invalid position!");
        }
    }
}