package DoublyLinkedList;

import java.util.ArrayList;

class IPNode{
    public int data;
    public IPNode next;
    public IPNode prev;
    public IPNode(int x){
        data = x;
        next = prev = null;
    }
}
class IPMain{
    public static IPNode InsertAtPos(IPNode head,int p,int x){
        ArrayList<IPNode> nodes = new ArrayList<>();
        IPNode curr = head;
        while(curr!=null){
            nodes.add(curr);
            curr = curr.next;
        }IPNode newNode = new IPNode(x);
        IPNode pNode = nodes.get(p);
        newNode.next = pNode.next;
        newNode.prev = pNode;
        if (pNode.next != null)
            pNode.next.prev = newNode;
        pNode.next = newNode;
        return head;
    }

    public static void printList(IPNode head) {
        while(head!=null){
            System.out.println(head.data);
            if(head.next!=null)
                System.out.println(" <-> ");
            head= head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        IPNode head = new IPNode(2);
        head.next = new IPNode(4);
        head.next.prev = head;
        head.next.next = new IPNode(5);
        head.next.next.prev = head.next;
        int p = 2,x=6;
        head = InsertAtPos(head,p,x);
        printList(head);
    }
}
