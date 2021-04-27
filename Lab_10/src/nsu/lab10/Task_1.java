package nsu.lab10;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Triangle triangle = new Triangle();

        System.out.print("enter side1: ");
        triangle.setSide1(input.nextDouble());

        System.out.print("enter side2: ");
        triangle.setSide2(input.nextDouble());

        System.out.print("enter side3: ");
        triangle.setSide3(input.nextDouble());

        System.out.print("enter triangle color: ");
        triangle.setColor(input.next());

        System.out.print("filled or not? ");
        triangle.setFilled(input.nextBoolean());

        System.out.println("Area= " + triangle.getArea());
        System.out.println("Perimeter= " + triangle.getPerimeter());
        System.out.println("Color= " + triangle.getColor());
        System.out.println("isFilled= " + triangle.isFilled());
    }
}
