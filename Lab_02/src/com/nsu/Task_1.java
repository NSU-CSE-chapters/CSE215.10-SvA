package com.nsu;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a, b and c: ");
        double r1,r2;
        double a= input.nextDouble();
        double b= input.nextDouble();
        double c= input.nextDouble();
        double discriminant = (b*b)-(4*a*c);
        double fDis = Math.sqrt(discriminant);
        if (discriminant>0){
                r1 = (-b+fDis)/ (2*a);
                r2 = (-b-fDis)/ (2*a);

            System.out.println("Root 1 = "+r1+" and Root 2 = "+r2);
        }else if (discriminant==0){
            r1 = -b/(2*a);
            System.out.println("Root = "+r1);
        } else System.out.println("The equation has no real roots.");


    }

}
