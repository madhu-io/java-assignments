import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class CountStackDuplicates {
    public static int countDuplicates(Deque<Integer> stack) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        while (!stack.isEmpty()) {
            int val = stack.pop();
            if (!seen.add(val)) {
                duplicates.add(val);
            }
        }
        return duplicates.size();
    }

    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(4);

        System.out.println(countDuplicates(stack));
    }
}