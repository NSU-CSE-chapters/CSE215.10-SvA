import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int k=0;k<n-1;k++){
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {


                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
