import java.util.HashSet;
import java.util.Set;

public class RemoveRepeated {
    public static void main(String[] args) {
        String input = "Nagaraj";
        char[] chars = input.toCharArray();
        Set<Character> seen = new HashSet<>();
        int writeIndex = 0;

        for (char c : chars) {
            if (seen.add(c)) {
                chars[writeIndex++] = c;
            }
        }

        String result = new String(chars, 0, writeIndex);

        System.out.println("Result: " + result); // Output: Ngarj (order may vary with HashSet)
    }
}