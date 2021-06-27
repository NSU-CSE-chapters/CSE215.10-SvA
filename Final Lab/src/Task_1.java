import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        System.out.print("enter the value a: ");
        double a = input.nextDouble();

        double sum = 1;
        int aPower = 1;


        for (int i = 2; i <= n; i++) {
            sum = sum + (Math.pow(i, i) / Math.pow(a, aPower));
            aPower = aPower + 2;


        }
        System.out.println("Sum of series = " + sum);
    }

}
