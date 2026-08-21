import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedLetter {
    public static void main(String[] args) {
        String name = "nagaraj";

        // 1. Store all individual letters in a List
        List<String> allLetters = new ArrayList<>();
        for (char c : name.toCharArray()) {
            allLetters.add(String.valueOf(c));
        }

        // 2. Filter unique letters using a HashSet
        Set<String> uniqueLetters = new HashSet<>(allLetters);

        // 3. Count frequencies and print ONLY if repeated
        for (String letter : uniqueLetters) {
            int count = Collections.frequency(allLetters, letter);

            // Only print if the letter appears more than once
            if (count > 1) {
                System.out.print("(" + letter + "," + count + ") ");
            }
        }
    }
}
