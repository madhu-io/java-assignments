import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Rmain{
    static void ReverseQueue(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()){
            st.push(q.peek());
            q.remove();
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(5);
        q.add(10);
        q.add(15);
        q.add(20);
        q.add(25);
        ReverseQueue(q);
        while(!q.isEmpty()){
            System.out.println(q.peek()+" ");
            q.remove();
        }
    }
}
