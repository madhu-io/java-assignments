class DNode{
    int data;
    DNode next;
    DNode(int x){
        data = x;
        next = null;
    }
}
class DMain{
    static DNode DeletingNode(DNode head){
        if(head == null)
            return null;
        DNode temp = head;
        head = head.next;
        temp = null;
        return head;
    }
    static void printList(DNode curr){
        while(curr!=null){
            System.out.println(curr.data);
            if(curr.next!=null){
                System.out.println(" -> ");
            }curr = curr.next;
        }
    }

    public static void main(String[] args) {
        DNode head = new DNode(8);
        head.next = new DNode(2);
        head.next.next = new DNode(3);
        head.next.next.next = new DNode(1);
        head.next.next.next.next = new DNode(7);
        head = DeletingNode(head);
        printList(head);
    }
}
public class DeletingNode {
}
