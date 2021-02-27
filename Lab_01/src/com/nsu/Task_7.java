package com.nsu;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double amountOfWater = scanner.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initTemp = scanner.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemp = scanner.nextDouble();

        // Q = M * (finalTemperature – initialTemperature) * 4184

        double q  = amountOfWater * (finalTemp-initTemp)*4184;

        System.out.println("The energy needed is "+q);
    }
}
