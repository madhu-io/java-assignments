import java.util.LinkedList;
import java.util.Queue;

public class QueueWork {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.poll();
        System.out.println(q.peek());
        System.out.println(((LinkedList<Integer>)q).getLast());
        if(q.isEmpty()){
            System.out.println("Queue is empty");
        }else{
            System.out.println("Queue is not empty");
        }
        System.out.println(q.size());
    }
}
