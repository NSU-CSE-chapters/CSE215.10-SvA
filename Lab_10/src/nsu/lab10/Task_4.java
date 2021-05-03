package nsu.lab10;

public class Task_4 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(10);

        System.out.println("circle1 is " + (circle1.equals(circle2) ? "" : " not ") + "euqal to circle2");

    }
}
