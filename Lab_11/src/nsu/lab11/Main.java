package nsu.lab11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int n = Integer.parseInt("1565");
        System.out.println(n);
        Scanner input = new Scanner(System.in);
        int count = 0;
        do {
            try {
                System.out.print("enter num1: ");
                int num1 = input.nextInt();
                System.out.print("enter num2: ");
                int num2 = input.nextInt();
                int res = num1 / num2;
                System.out.println("result = " + res);
                count++;


            } catch (Exception exception) {
                System.out.println("exception : " + exception);
                System.out.println("you must enter integer. please try again");


            }
        } while (count == 0);


    }
}
