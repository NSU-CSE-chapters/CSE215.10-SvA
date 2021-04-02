package com.cse215;

public class Task_2 {
    public static void main(String[] args) {
            MyInteger myInteger = new MyInteger(100);
            MyInteger myInteger12 =new MyInteger(3);

        System.out.println("isEven? "+myInteger.isEven());
        System.out.println("isOdd? "+myInteger.isOdd());
        System.out.println("isPrime? "+myInteger.isPrime());

        System.out.println();

        System.out.println(MyInteger.isEven(5));
        System.out.println(MyInteger.isOdd(7));
        System.out.println(MyInteger.isPrime(11));

        System.out.println();
        System.out.println("Parse char to int: "+MyInteger.parseInt(new char[]{'f','1','2','r'}));
        System.out.println("parse string to int: "+MyInteger.parseInt("fahim"));

        System.out.println();

        System.out.println("obj using: "+MyInteger.isEven(myInteger12));
    }
}
