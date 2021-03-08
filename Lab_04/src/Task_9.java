/*
* (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon in which all sides
are of the same length and all angles have the same degree (i.e., the polygon is both equilateral and
equiangular). The formula for computing the area of a regular polygon is

Area =
5 ∗ s2
4 ∗ tan ቀ
π
5
ቁ

Write a method that returns the area of a regular polygon using the following header:
public static double area(int n, double side)
Write a main method that prompts the user to enter the number of sides and the side of a regular
polygon and displays its area. Here is a sample run:
Enter the side: 5.5
The area of the pentagon is 52.04444136781625
*
* */

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number side: ");
        int n = input.nextInt();
        System.out.print("Enter the side: ");
            double side = input.nextDouble();
        double ans = area(n,side);
        System.out.println("The area of the pentagon is "+ans);
    }
    public static double area(int n, double side){
            double area = (n*Math.pow(side, 2))/(4*Math.tan(Math.PI/n));

            return  area;
    }

}
