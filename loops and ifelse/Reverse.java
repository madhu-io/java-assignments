import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int a = x;
        int rev = 0;
        int rem = 0;
        while (x>0){
            rem = x%10;
            rev = rev*10+rem;
            x/=10;

        }
        System.out.println("Given digits: "+a);
        System.out.println("Reserve digits: "+rev);
    }
}
