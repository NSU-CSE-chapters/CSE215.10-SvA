package nsu.lab08;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();
        String color = input.next();
        boolean isFill = input.nextBoolean();

        Triangle triangle = new Triangle(s1,s2,s3);
        triangle.setColor(color);
        triangle.setFilled(isFill);


        System.out.println("area= "+triangle.getArea());
        System.out.println("perimeter= "+triangle.getPerimeter());
        System.out.println("color= "+triangle.getColor());
        System.out.println("filled= "+triangle.isFilled());

    }
}
