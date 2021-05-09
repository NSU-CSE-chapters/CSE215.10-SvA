package nsu.helpingHand;

public class OverloadProblem {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        System.out.println(show(a));
        System.out.println(show(a,b));
    }

    public  static int show(int a){
        return a;
    }

    public  static int show(int a,int b){
        System.out.println(a+" "+b);
        int sum = a+b;
        return sum;

    }
}
