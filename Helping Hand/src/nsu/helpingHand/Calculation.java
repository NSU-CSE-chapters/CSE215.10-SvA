package nsu.helpingHand;

public class Calculation implements Calculator{
    private double num1;
    private double num2;

    public Calculation() {
        this.num1 = 0.0;
        this.num2=0.0;
    }

    public Calculation(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @Override
    public double addition(double a, double b) {
        return a+b;
    }

    @Override
    public double product(double a, double b) {
        return a*b;
    }

    @Override
    public void printResult() {
        System.out.print("result: ");
    }
}
