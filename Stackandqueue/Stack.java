import java.util.*;

class StackDuplicateRemoverCollection {

    public static void removeDuplicates(Stack<Integer> stack) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>(stack);

        stack.clear();
        stack.addAll(set);
    }
}

class SMain {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(2);
        s.push(3);
        s.push(3);
        s.push(4);

        StackDuplicateRemoverCollection duplicate =
                new StackDuplicateRemoverCollection();

        duplicate.removeDuplicates(s);

        System.out.println(s);
    }
}