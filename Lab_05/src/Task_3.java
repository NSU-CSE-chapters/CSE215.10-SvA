import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");

        int count =0;

        // unsolved

        int[] check = new int[10];

        for (int i = 0; i < 9; i++) {
            int n= input.nextInt();
            check[n]++;
        }

        for (int i = 0; i < check.length; i++) {
            if ((check[i]==1)){
                count++;

            }
        }


    }
}
