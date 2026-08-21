import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter int number to convert float : ");
        int x = sc.nextInt();
        System.out.println((float) x);

        System.out.println("Enter float number to convert Int : ");
        float y = sc.nextFloat();
        System.out.println((int) y);

        System.out.println("Enter int number to convert double : ");
        int z = sc.nextInt();
        System.out.println((double) z);

        System.out.println("Enter double number to convert int : ");
        double M = sc.nextDouble();
        System.out.println((int) M);

        System.out.println("Enter float number to convert double : ");
        float N = sc.nextFloat();
        System.out.println((double) N);

        System.out.println("Enter double number to convert float : ");
        double O = sc.nextDouble();
        System.out.println((float) O);

        int a = 10;
        double b = x;
        System.out.println(b);
    }
}
