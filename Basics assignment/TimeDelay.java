public class TimeDelay {
    public static void main(String[] args) {
        try {
            for (int i = 3; i>0; i--) {

                System.out.print("\r" + i);

                Thread.sleep(1000);
            }

            System.out.print("\r after 3 seconds\n");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
