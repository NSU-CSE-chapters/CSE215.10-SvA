package nsu.lab09;


public class Test{
    public static void main(String[] args) {
        B b = new B(5,25);
        System.out.println("the result is = "+b.value());

    }
}

 class A{
    private double length;
    public A(double length){
        this.length = length;
    }
    public double getLength(){
        return this.length;
    }
    public double value(){
        return 2 * length;
    }
}


 class B extends A{
    private int num;
    public B(int num, double length){
        super(length);
        this.num = num;
    }
    public double value(){
        return super.value() * num;
    }
}