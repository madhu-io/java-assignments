class DLMain{
    static class DLNode{
        int data;
        DLNode next;
    DLNode(int x){
        this.data = x;
        this.next = null;
    }
}static DLNode DeleteLast(DLNode head){
    if(head == null){
    return null;
    }
    if(head.next == null){
        return null;
    }
    DLNode secondLast = head;
    while(secondLast.next.next != null){
        secondLast = secondLast.next;
    }secondLast.next = null;
    return head;
    }
    static void printList(DLNode head){
        while(head!= null){
            System.out.println(head.data+" -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DLNode head = new DLNode(1);
        head.next = new DLNode(2);
        head.next.next = new DLNode(3);
        head.next.next.next = new DLNode(4);
        head.next.next.next.next = new DLNode(5);
        head = DeleteLast(head);
        printList(head);
    }
}
