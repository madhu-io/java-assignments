import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner ma = new Scanner(System.in);
        System.out.print("Enter the Quantity: ");
        int Quantity = ma.nextInt();
        System.out.print("Enter the Price: ");
        int price = ma.nextInt();

        if(Quantity>100){
            double finalprice= (price-(price*0.10));
            System.out.println(finalprice + "this is the final amount after discount");
        }
        else{
            System.out.println("Your are not eligible for discount");
        }


    }
}
