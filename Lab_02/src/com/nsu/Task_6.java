package com.nsu;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if (a+b>c || a+c>b || b+c>a){
            double perimeter = a+b+c;
            System.out.println("The perimeter of the triangle is: "+perimeter);
        }else System.out.println("the input are invalid.");
    }
}
