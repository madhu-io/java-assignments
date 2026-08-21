import java.util.Scanner;

public class WorkerEfficiency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter time taken by worker (in hours): ");
        double time = sc.nextDouble();

        if (time >= 2 && time < 3) {
            System.out.println("Worker is highly efficient");
        }
        else if (time >= 3 && time < 4) {
            System.out.println("Worker should improve speed");
        }
        else if (time >= 4 && time <= 5) {
            System.out.println("Worker is given training to improve speed");
        }
        else if (time > 5) {
            System.out.println("Worker has to leave the company");
        }
        else {
            System.out.println("Invalid time entered");
        }

        sc.close();
    }
}