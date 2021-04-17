package nsu.lab09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();


        while (true) {
            display();
            int n = scanner.nextInt();


            if (n == 1) {
                System.out.print("enter an integer: ");
                int temp = scanner.nextInt();
                integers.add(temp);
                System.out.println("added..");
            } else if (n == 2) {
                System.out.print("which index you want to remove: ");
                int temp = scanner.nextInt();
                if (integers.contains(temp)) {
                    integers.remove(Integer.valueOf(temp));
                    System.out.println("removed");

                } else System.out.println("element not found");
            } else if (n == 3) {
                System.out.println("your list: " + integers.toString());
            } else if (n == 4) {
                System.exit(0);
            } else System.out.println("invalid choice");

        }
    }


    public static void display() {
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Display");
        System.out.println("4. Exit");

        System.out.println();
        System.out.print("Your choice: ");

    }
}
