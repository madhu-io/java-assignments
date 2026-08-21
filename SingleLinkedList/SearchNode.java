public class SearchNode {
    // Search for a target value and return its 1-based position, or -1 if not found
    public static int search(Node head, int target) {
        Node temp = head;
        int position = 1;

        while (temp != null) {
            if (temp.data == target) {
                return position; // Found element
            }
            temp = temp.next;
            position++;
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        int target = 20;
        int pos = search(head, target);

        if (pos != -1) {
            System.out.println("Element " + target + " found at position: " + pos);
        } else {
            System.out.println("Element " + target + " not found in the list.");
        }
    }
}