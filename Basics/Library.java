import java.util.Scanner;

public class Library {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days late: ");
        int days = sc.nextInt();

        if (days > 30) {
            System.out.println("Membership Cancelled");
        }
        else if (days <= 5) {
            double fine = days * 0.50;
            System.out.println("Fine = Rs. " + fine);
        }
        else if (days <= 10) {
            int fine = (int) ((days - 5) * 1 + (5 * 0.50));
            System.out.println("Fine = Rs. " + fine);
        }
        else {
            double fine = (5 * 0.50) + (5 * 1) + ((days - 10) * 5);
            System.out.println("Fine = Rs. " + fine);
        }

        sc.close();
    }
}