package nsu.lab10;

public class Rectangle extends GeometricObject {

    private double height;
    private double width;

    public Rectangle() {
        this.height = 0;
        this.width = 0;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }


    @Override
    public double getArea() {
        return this.height * this.width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (height + width);
    }
}
