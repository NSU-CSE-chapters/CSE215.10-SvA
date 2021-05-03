package nsu.lab10;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GeometricObject[] geometricObject = new GeometricObject[5];


        for (int i = 0; i < geometricObject.length; i++) {
            System.out.print("enter the side of the Square: ");

            geometricObject[i] = new Square(input.nextDouble());
            System.out.println("area of square " + (i + 1) + " is " + geometricObject[i].getArea());
            ((Square)geometricObject[i]).howToColor();
        }
    }
}
