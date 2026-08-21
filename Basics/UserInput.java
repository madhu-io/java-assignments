import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println("Hello! "+name );
        System.out.println(name + " Enter Your Age: ");
        int age = sc.nextInt();

        System.out.println(name + " You are "+age+" years old.");

    }
}
