import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String reversed = "";
        for(int i =0;i<a.length();i++){
            reversed = a.charAt(i)+ reversed;

            }
            System.out.println(reversed.equals(a)?a +" is palindrome":a+" not palindrome");

        }
    }
