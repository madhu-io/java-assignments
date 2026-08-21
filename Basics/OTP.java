import java.util.Random;
public class OTP {
    public static void main(String[] args) {
        Random random = new Random();
        int otp = 100000 + (random.nextInt(999999) + 1);
        System.out.println(otp);
    }
}
