package CircularLinkedList;

class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class CircularLinkedList{
    private Node head;
    private Node tail;
    public CircularLinkedList(){
        head = null;
        tail = null;
    }

    public void insert(int data){
    Node newNode = new Node(data);
    if(head==null){
        head = newNode;
        tail = newNode;
        newNode.next = head;
    }else{
        newNode.next = head;
        tail.next = newNode;
        tail = newNode;
    }
}public void delete(int key){
    if(head == null){
        return;
    }Node curr = head;
    Node prev = null;
    while(curr.next!= head){
        if(curr.data == key){
            if(prev == null){
                Node last = head;
                while(last.next!=head){
                    last = last.next;
                }head = curr.next;
                last.next = head;
                return;
            }else{
                prev.next = curr.next;
                if(curr == tail){
                    tail = prev;
                }return;
            }
        }prev = curr;
        curr = curr.next;
    }if(curr == head&&curr.data == key){
        prev.next = head;
        tail=prev;
        }

    }public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Linked List Elements :");
        Node itr = head;;
        do{
            System.out.println(itr.data+ " ");
            itr = itr.next;
        }while (itr!=head);
        System.out.println();
    }
}
class Main{
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.printList();
        list.delete(2);
        list.printList();
    }
}
