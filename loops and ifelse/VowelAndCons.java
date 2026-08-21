import java.util.Scanner;

public class VowelAndCons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();

        int vowels = 0;
        int cons = 0;
        for(char c : b.toLowerCase().toCharArray()){

            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') vowels++;
            else{
            cons++;
        }}
        System.out.println(vowels);
        System.out.println(cons);
    }
}
