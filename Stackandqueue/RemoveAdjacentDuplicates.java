import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveAdjacentDuplicates {
    public static String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.removeLast());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
}