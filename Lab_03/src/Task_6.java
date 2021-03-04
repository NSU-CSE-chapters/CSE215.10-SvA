import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            // printing spaces, 4 at a time from j=0 to j= n-i
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("    ");
            }

            // Printing number increamentally from 0 to i-1
            for (int j = 0; j < i; j++) {
                System.out.printf("%4d", (int) Math.pow(2, j));
            }

            // Printing number decreamentally from i-2 to 0
            for (int j = i - 2; j >= 0; j--) {
                System.out.printf("%4d", (int) Math.pow(2, j));
            }
            System.out.println();

        }
    }
}
