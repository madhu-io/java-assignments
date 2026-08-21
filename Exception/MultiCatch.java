public class MultiCatch {
        public static void main(String[] args) {

            try {
                int a = 10;
                int b = 0;

                System.out.println(a / b);
            }
            catch (ArithmeticException e) {
                System.out.println("Arithmetic error");
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index error");
            }
            catch (Exception e) {
                System.out.println("Some other exception");
            }
        }
    }
