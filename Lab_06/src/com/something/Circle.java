package com.something;

public class Circle {
    double radius;
    double center_x;
    double center_y;

    Circle(double radius, double center_x, double center_y){
        this.radius = radius;
        this.center_x = center_x;
        this.center_y = center_y;
    }

    double getArea(){
        return  Math.PI * radius* radius;
    }

}
