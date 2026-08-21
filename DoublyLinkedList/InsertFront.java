package DoublyLinkedList;
class INode{
    int data;
    INode next,prev;
    INode(int newData){
        data = newData;
        next = prev = null;
    }
}
class IMain{
    public static INode InsertFront(INode head,int newData){
        INode newINode = new INode(newData);
        newINode.next = head;
        if(head!=null){
            head.prev = newINode;

        }return newINode;
    }

    public static void printList(INode head) {
        INode curr = head;
        while(curr!= null){
            System.out.println(curr.data);
            if(curr.next != null){
                System.out.println(" <-> ");

            }curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        INode head = new INode(2);
        head.next = new INode(3);
        head.next.prev = head;
        head.next.next = new INode(4);
        head.next.next.prev = head.next;
        int data = 1;
        head = InsertFront(head,data);
        printList(head);
    }
}