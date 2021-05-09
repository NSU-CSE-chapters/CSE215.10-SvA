package nsu.lab10;

import java.awt.*;
import java.util.Scanner;

public class Task_5 {

    // not solved


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GeometricObject[] geometricObjects = new GeometricObject[4];


        for (int i = 0; i < 2; i++) {
            System.out.print("enter the radius for the circle " + (i + 1)+": ");
            geometricObjects[i] = new Circle(input.nextDouble());
            System.out.print("enter the height and width for the rectangle " + (i + 1)+": ");

            geometricObjects[i] = new Rectangle(input.nextDouble(), input.nextDouble());
        }
//        GeometricObject[] circle = new Circle[2];
//        GeometricObject[] rectangle = new Rectangle[2];

//        for (int i = 0; i < circle.length; i++) {
//            circle[i] = new Circle(input.nextDouble());
//        }
//
//        for (int i = 0; i < rectangle.length; i++) {
//            rectangle[i] = new Rectangle(input.nextDouble(),input.nextDouble());
//        }


        System.out.println("total sum= " +  sumArea(geometricObjects));

    }


    public static double sumArea(GeometricObject[] a) {
        double sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i].getArea();
        }
        return sum;
    }
}
