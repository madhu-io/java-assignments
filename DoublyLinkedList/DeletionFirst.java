package DoublyLinkedList;
class Dmain{
    public static Node DeletionFirst(Node head){
        if(head == null){
            return null;
        }Node temp = head;
        head = head.next;
        if(head!= null){
            head.prev = null;
        }
        return head;
    }
    public static void printList(Node head){
        Node curr = head;
        while(curr!= null){
            System.out.println(curr.data  + " "  );
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next  = new Node(3);
        head.next.next.prev = head.next;
        System.out.println("Original Linked list: ");
        printList(head);
        System.out.println("After Deletion at the beginning: ");
        head =  DeletionFirst(head);
        printList(head);
    }
}
