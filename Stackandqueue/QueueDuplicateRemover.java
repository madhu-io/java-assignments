import java.util.*;

public class QueueDuplicateRemover {

    public static void removeDuplicates(Queue<Integer> queue) {
        HashSet<Integer> seen = new HashSet<>();
        Queue<Integer> tempQueue = new LinkedList<>();

        while (!queue.isEmpty()) {
            int current = queue.remove();

            if (!seen.contains(current)) {
                seen.add(current);
                tempQueue.add(current);
            }
        }
        while (!tempQueue.isEmpty()) {
            queue.add(tempQueue.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(3);
        queue.add(2);
        queue.add(3);
        queue.add(1);
        queue.add(5);

        System.out.println("Original Queue: " + queue);
        removeDuplicates(queue);
        System.out.println("Queue after duplicate removal: " + queue);
    }
}