import java.util.Scanner;

public class Task3_2021183 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int n = input.nextInt();

        // loop for 1 to n
        for (int i = 1; i <= n; i++) {
            // create space
            for (int j = n - i; j >= 1; j--) {
                System.out.print("  ");
            }
            // number each row
            for (int k = i; k >= 2; k--) {
                System.out.print(k + " ");
            }
            // number  each row
            for (int l = 1; l <= i; l++) {
                System.out.print(l + " ");
            }
            //  new line
            System.out.println();
        }
    }
}
