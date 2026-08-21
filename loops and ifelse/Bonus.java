import java.util.Scanner;
public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Current Year: ");
        int currentyear = sc.nextInt();
        System.out.println("Enter Joined year : ");
        int joinYear = sc.nextInt();
        int gap = (currentyear - joinYear);
        if (gap>3 ){
            System.out.println("You are eligible for the  2500rs bonus ");
        }else{
            System.out.println("Nothing");
        }

    }
}
