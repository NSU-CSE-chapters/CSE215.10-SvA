import java.util.Scanner;

public class TasK_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        long n = input.nextLong();

        System.out.println("sum of the digit is: " + sumDigits(n));

    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            int rem = (int) (n % 10);
            sum += rem;
            n /= 10;
        }

        return sum;
    }
}
