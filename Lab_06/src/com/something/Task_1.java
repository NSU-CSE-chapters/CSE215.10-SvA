package com.something;

public class Task_1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,40);
        Rectangle r2 = new Rectangle(3.5,35.9);

        System.out.println("the first rectangle's width is "+ r1.width);
        System.out.println("the first rectangle's height is "+ r1.height);
        System.out.println("the first rectangle's area is "+ r1.getArea());
        System.out.println("the first rectangle's perimeter is "+ r1.getPerimeter());
        System.out.println();

        System.out.println("the second rectangle's width is "+r2.width);
        System.out.println("the second rectangle's height is "+r2.height);
        System.out.println("the second rectangle's area is "+r2.getArea());
        System.out.println("the second rectangle's perimeter is "+r2.getPerimeter());
    }
}
