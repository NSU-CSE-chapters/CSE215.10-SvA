package com.something;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter 3 sides of the triangle: ");

        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();

        Triangle triangle = new Triangle(s1,s2,s3);

//        triangle.print();

        System.out.println("area= "+triangle.getArea());
        System.out.println("perimeter = "+triangle.getPerimeter());

    }
}
