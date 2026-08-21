import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(100) + 1;
        System.out.println(x%2==0?"Even":"Odd");
    }
}
