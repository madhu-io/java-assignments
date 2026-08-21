public class TryCatchFinally {

        public static void main(String[] args) {

            try {
                int x = 10 / 0;
                System.out.println(x);
            }
            catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
            }
            finally {
                System.out.println("Finally block executed");
            }
        }
    }

