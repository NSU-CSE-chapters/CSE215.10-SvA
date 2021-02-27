package com.nsu;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");
        double speed = scanner.nextDouble();
        double acceleration = scanner.nextDouble();

        double length  = (speed*speed)/(2*acceleration);

        System.out.printf("The minimum runway length for this airplane is %.3f \n", length);



    }
}
