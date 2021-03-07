/* (Sort three numbers) Write a method with the following header to display three numbers in
increasing order:
public static void displaySortedNumbers(double num1, double num2, double num3)
Write a test program that prompts the user to enter three numbers and invokes the method to display
them in increasing order.*/

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");

        double n1, n2, n3;
        n1 = input.nextDouble();
        n2 = input.nextDouble();
        n3 = input.nextDouble();
        displaySortedNumbers(n1,n2,n3);

    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double max;
        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                System.out.print("increasing order: " + num3 + " " + num2 + " " + num1);
            } else System.out.print("increasing order: " + num2 + " " + num3 + " " + num1);

        }
       else if (num2 >= num3 && num2 >= num1) {
            if (num1 >= num3) {
                System.out.print("increasing order: " + num3 + " " + num1 + " " + num2);
            } else System.out.print("increasing order: " + num1 + " " + num3 + " " + num2);

        } else if (num3 >= num2 && num3 >= num1) {
            if (num1 >= num2) {
                System.out.print("increasing order: " + num2 + " " + num1 + " " + num3);
            } else System.out.print("increasing order: " + num1 + " " + num2 + " " + num3);

        }

    }

}
