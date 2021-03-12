import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        // user input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        if (isSorted(arr)) {
            System.out.println("The list is already sorted");
        } else System.out.println("The list is not sorted");

    }

    public static boolean isSorted(int[] list) {
        int count = 0;
        int n = list.length;
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] <= list[i + 1]) {

                count++;


            }
        }
        if (count == (n - 1)) {
            return true;
        } else
            return false;
    }
}
