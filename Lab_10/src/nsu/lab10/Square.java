package nsu.lab10;

public class Square extends GeometricObject implements Colorable {

    private int side;

    public Square(int side1) {
        this.side = side1;

    }

    public int getSide1() {
        return side;
    }

    public void setSide1(int side1) {
        this.side = side1;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void howToColor() {
        System.out.println("side1 = ");
    }


}
