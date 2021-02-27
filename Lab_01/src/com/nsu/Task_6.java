package com.nsu;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");

        double st = scanner.nextDouble();
        double gr = scanner.nextDouble();
        double gratuity = (gr/100)*st;
        double subtotal = st+gratuity;

        System.out.println("The gratuity is $"+gratuity+" and total is $"+subtotal);
    }
}
