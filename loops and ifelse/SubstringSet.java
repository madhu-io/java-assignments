import java.util.HashSet;

public class SubstringSet {
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<>();
        name.add("Nagaraj");
        name.add("Bharath");
        name.add("Madhu");

        HashSet<String> name2 = new HashSet<>();
        name2.add("Nagaraj");
        name2.add("Bharath");
        System.out.println(name.containsAll(name2));

    }
}
