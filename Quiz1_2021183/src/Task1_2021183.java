import java.util.Scanner;

public class Task1_2021183 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // enter length
        System.out.print("Enter the side: ");
        double length = input.nextDouble();

        // enter side
        System.out.print("Enter the number of sides: ");
        double side = input.nextDouble();

        // polygon formula

        double area = (side* Math.pow(length,2))/(4*Math.tan((Math.PI)/side));

        System.out.println("The area of the polygon is "+area);

    }
}
