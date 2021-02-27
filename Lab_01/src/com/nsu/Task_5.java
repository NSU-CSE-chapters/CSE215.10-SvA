package com.nsu;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");

        double celsius = scanner.nextDouble();

        double fahrenheit = (9/5.0)*celsius +32;

        System.out.println((int)celsius+" Celsius is "+fahrenheit+" Fahrenheit");
    }
}
