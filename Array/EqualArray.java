import java.util.Arrays;
import java.util.Scanner;
//using Only forloop
public class EqualArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 2;

        System.out.println("Enter numbers1: ");
        int[] numbers1 = new int[size];
        for (int i = 0; i<size;i++) {
            numbers1[i] = sc.nextInt();
        }
        System.out.println("Enter numbers2: ");
        int[] numbers2 = new int[size];
        for (int i = 0; i<size;i++){
            numbers2[i] = sc.nextInt();
        }
        System.out.println("my arrays"+ Arrays.toString(numbers1));
        System.out.println("my arrays"+ Arrays.toString(numbers2));

        for(int i = 0;i<size;i++){

            if (numbers1[i] == numbers2[i]){
                System.out.println("Same number : "+ numbers1[i]);
            }else if(numbers1[i]!=numbers2[i]){
                System.out.println("Dont have duplicate number");
            }

        }
    }
}
