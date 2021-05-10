package nsu.lab11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter two integers: ");
        int sum = 0;
        boolean decision = false;
        do {
            try {
                int a = input.nextInt();
                int b = input.nextInt();
                sum = a + b;
                System.out.println("sum = " + sum);
                decision = false;
            } catch (InputMismatchException e) {
                System.out.println(e);
                System.out.print("enter integers again: ");
                decision = true;
                input.nextLine();

            }
        } while (decision);


    }
}
