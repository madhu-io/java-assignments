class INode{
    int data;
    INode next;
    INode(int x){

        data = x;
        next = null;
    }
}
class main{
    static INode SpecificPos(INode head,int pos,int val){
        if(pos<1)
            return head;
        if (pos == 1) {
            INode newNode = new INode(val);
            newNode.next = head;
            return newNode;
        }
        INode curr = head;
        for(int i =1;i<pos-1 && curr!=null;i++){
            curr = curr.next;
        }if (curr == null)
            return head;
        INode newNode = new INode(val);
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }
    static void printList(INode head){
        INode curr = head;
        while (curr!= null){
            System.out.println(curr.data);
            if(curr.next != null){
                System.out.println(" -> ");
            }curr = curr.next;

            System.out.println();        }
    }

    public static void main(String[] args) {
        INode head = new INode(1);
        head.next = new INode(2);
        head.next.next = new INode(4);
        int val = 3,pos = 3;
        head = SpecificPos(head,pos,val);
        printList(head);
    }
}
