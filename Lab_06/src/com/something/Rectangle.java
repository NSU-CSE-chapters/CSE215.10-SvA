package com.something;

public class Rectangle {
    double width = 1;
    double height = 1;

    // no arg constructor
    Rectangle() {

    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //  methods
    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}
