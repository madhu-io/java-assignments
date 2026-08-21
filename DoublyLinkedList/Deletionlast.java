package DoublyLinkedList;

class DMain{
    public static Node DeletionLast(Node head){
        if(head == null){
            return null;
        }if(head.next ==null){
            return null;
        }Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        if(curr.prev!= null){
            curr.prev.next = null;

        }return head;

    }public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        System.out.println("Original linked list: ");
        printList(head);
        System.out.println("After Deletion at the end: ");
        head = DeletionLast(head);
        printList(head);
    }
}