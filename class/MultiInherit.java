/*
multilevel Inheritence:
 A class inherit from a subclass creating a chain of inheritence
 ex: child extends parent and parents extends grantparents
*/
class Vehicle{
    Vehicle(){
        System.out.println("This is a vehicle");
    }
}class FourWheeler extends Vehicle{
    FourWheeler(){
        System.out.println("4 Wheeler Vehicles");;
    }
}
class Car extends FourWheeler{
    Car(){
        System.out.println("This 4 wheeler vehicle is a Car");
    }
}
public class MultiInherit{
    public static void main(String[] args) {
        Car obj = new Car();


    }
}
/*
generete a random int in the range(1-100)
    first 10 lucas numbers
        check the ugly number

        public class UglyNumber {
    public static boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        int[] primeFactors = {2, 3, 5};
        for (int factor : primeFactors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }
    public static void main(String[] args) {
        int testNum = 6;
        System.out.println(testNum + " is ugly: " + isUgly(testNum)); // Output: true

        testNum = 14;
        System.out.println(testNum + " is ugly: " + isUgly(testNum)); // Output: false
    }
}

  */