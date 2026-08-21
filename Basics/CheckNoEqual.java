import java.util.*;
public class CheckNoEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a = sc.nextInt();
        System.out.println("Enter number 2: ");
        int b = sc.nextInt();
        System.out.println("Enter number 3: ");
        int c = sc.nextInt();
        if (a==b && b==c){
            System.out.println("Three Numbers are Equal");
        }else{
            System.out.println("not Equal");
        }

    }
}
