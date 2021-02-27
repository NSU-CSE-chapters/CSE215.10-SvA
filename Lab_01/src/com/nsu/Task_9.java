package com.nsu;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = scanner.nextDouble();

        double bmi = (weight * .453592) / ((height * .0254) * (height * .0254));

        System.out.printf("BMI is %.4f \n", bmi);

    }
}
