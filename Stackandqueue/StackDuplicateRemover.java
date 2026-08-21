import java.util.*;
public class StackDuplicateRemover {
    public static void removeDuplicates(Stack<Integer> stack){
        HashSet<Integer> seen = new HashSet<>();
        Stack<Integer> tempStack = new Stack<>();
        while(!stack.isEmpty()){
            int current = stack.pop();
            if(!!seen.contains(current)){
                seen.add(current);
                tempStack.push(current);
            }
        }
        while(!tempStack.isEmpty()){
            stack.push(tempStack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(3);
        stack.push(1);
        stack.push(5);
        System.out.println("Original Stack: "+stack);
        removeDuplicates(stack);
        System.out.println("Stack after duplicate removal: "+stack);
    }
}
