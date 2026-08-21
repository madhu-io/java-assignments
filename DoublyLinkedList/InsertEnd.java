package DoublyLinkedList;
class IENode{
    int data;
    IENode prev;
    IENode next;
    IENode(int value){
        data = value;
        prev = null;
        next = null;
    }
}
class IEMain{
    public static IENode InsertEnd(IENode head,int newData){
        IENode newIENode = new IENode(newData);
        if(head == null){
            head = newIENode;

        }else{
            IENode curr = head;
            while(curr.next != null){
                curr = curr.next;
            }curr.next = newIENode;
            newIENode.prev = curr;
        }
        return head;
    }
    public static void printList(IENode head){
        IENode curr = head;
        while(curr!= null){
            System.out.println(curr.data);
            if(curr.next!= null){
                System.out.println(" <-> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        IENode head = new IENode(1);
        head.next = new IENode(2);
        head.next.prev = head;
        head.next.next = new IENode(3);
        head.next.next.prev = head.next;
        head = InsertEnd(head,4);
        printList(head);
    }
}
