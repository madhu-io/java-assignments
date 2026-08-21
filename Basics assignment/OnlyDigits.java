public class OnlyDigits {
    public static void main(String[] args) {
        String str = "123456";
        boolean flag = true;

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                flag = false;
                break;
            }
        }

        if (flag)
            System.out.println("Digits Only");
        else
            System.out.println("Not Digits Only");
    }
}
