import java.util.*;
public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "bharathganesh";
        String pass = "bharath";
        String user = sc.nextLine();
        String password = sc.nextLine();
        if((user.equals(username))&&(pass.equals(password))){
            System.out.println("Login Successfully");
        }else{
            System.out.println("Incorrect Details");
        }

    }
}
