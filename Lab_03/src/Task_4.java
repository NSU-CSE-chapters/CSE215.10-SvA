import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Integer: ");

        int n = input.nextInt();
        int i = 2;
        while (n > 1) {
            if (n % i == 0) {
                n /= i;
                System.out.print(i + " ");
                continue;
            }
            i++;
        }
    }
}
