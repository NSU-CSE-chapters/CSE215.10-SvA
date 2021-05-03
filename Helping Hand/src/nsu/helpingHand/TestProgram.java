package nsu.helpingHand;

import java.util.Scanner;

public class TestProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter num1 : ");
        double a = input.nextDouble();
        System.out.print("enter num2: ");
        double b = input.nextDouble();
        Calculator calculator = new Calculation(a, b);

        System.out.println("addition: "+calculator.addition(a,b));
        System.out.println("product: "+calculator.product(a,b));



    }

}
