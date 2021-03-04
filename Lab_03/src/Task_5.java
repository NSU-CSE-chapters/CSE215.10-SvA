import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {


        System.out.print("Enter an Integer: ");
        Scanner input = new Scanner(System.in);

        //get the total number of lines n.
        int n = input.nextInt();

        //Loop through the lines from 1 to n
        for (int i = 1; i <= n; i++) {
            // printing spaces, 2 at a time from j=1 to j= n-i
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }

            //Printing number decreamentally from the line number j to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            //Printing number increamentally from 2 to line number j
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
}
