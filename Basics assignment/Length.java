public class Length {
    public static void main(String[] args) {
        String str = "Programming";

        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }

        System.out.println(count);
    }
}
