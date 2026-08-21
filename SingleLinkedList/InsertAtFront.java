class CNode{
    int data;
    CNode next;
    CNode(int new_data){
        this.data = new_data;
        this.next = null;
    }
}
class NodeMain{
    static CNode InsertAtFront(CNode head,int x){
        CNode newNode = new CNode(x);
        newNode.next = head;
        return newNode;
    }
    static void printList(CNode head){
        CNode curr = head;
        while(curr!= null){
            System.out.println(curr.data);
            if(curr.next!= null){
                System.out.println(" - > ");
            }curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CNode head = new CNode(2);
        head.next = new CNode(3);
        head.next.next = new CNode(4);
        head.next.next.next = new CNode(5);
        int x = 1;
        head = InsertAtFront(head,x);
        printList(head);
    }
}
