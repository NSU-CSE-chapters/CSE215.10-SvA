package nsu.lab10;

import java.util.Objects;

public class Circle extends GeometricObject implements Comparable {

    private double radius;

    public Circle() {
        this.radius = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public int compareTo(Object o) {
        if (this.radius > ((Circle) o).radius) {
            return 1;
        } else if (this.radius < ((Circle) o).radius) {
            return -1;
        } else return 0;
    }

    @Override
    public boolean equals(Object o) {
       return  this.compareTo((Circle)o)==0;

    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
