import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class RemoveQueueDuplicates {
    public static void removeDuplicates(Queue<Integer> queue) {
        Set<Integer> seen = new HashSet<>();
        int size = queue.size();

        for (int i = 0; i < size; i++) {
            int current = queue.poll();
            if (!seen.contains(current)) {
                seen.add(current);
                queue.offer(current);
            }
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(10);
        queue.offer(30);
        queue.offer(20);
        queue.offer(40);

        removeDuplicates(queue);
        System.out.println(queue);
    }
}