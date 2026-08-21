import java.util.ArrayList;
import java.util.Scanner;

public class RemoveNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        int size = 3;
        while (names.size() < size) {
            names.add(sc.nextLine());
        }

        names.removeIf(name -> name.toLowerCase().contains("a"));

        for (String name : names) {
            System.out.println(name);
        }
    }
}
