package com.nsu;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        System.out.print("Enter an integer, the input ends if it is 0: ");
        Scanner input = new Scanner(System.in);
        int pos = 0, neg = 0, count = 0;
        double avg, total = 0;
        int n = input.nextInt();

        while (n != 0) {
            if (n > 0) {
                pos++;
            } else {
                neg++;
            }
            count++;
            total += n;
            n = input.nextInt();
        }
        avg = total / count;
        System.out.println("The number of positives is " + pos);
        System.out.println("The number of negatives is " + neg);
        System.out.println("Total is " + total);
        System.out.println("The avarage is " + avg);

    }
}
