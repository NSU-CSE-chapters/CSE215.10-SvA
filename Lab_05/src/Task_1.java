import java.util.Scanner;

/*
(Reverse the numbers entered) Write a program that reads ten integers and displays them in the reverse of the
order in which they were read.
 */
public class Task_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter 10 integers: ");
        int[] number = new int[10];

        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }

        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }
}
