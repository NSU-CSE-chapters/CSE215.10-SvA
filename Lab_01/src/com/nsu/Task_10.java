package com.nsu;

import java.lang.Math;
import java.text.DecimalFormat;

public class Task_10 {
    public static void main(String[] args) {
        System.out.println("a\tb\tpow(a,b)");
        DecimalFormat df = new DecimalFormat("#");

        for (int a = 1, b = 2; a <= 5; a++, b++) {
            System.out.println(a + "\t" + b + "\t" + df.format(Math.pow(a, b)));
        }
    }
}
