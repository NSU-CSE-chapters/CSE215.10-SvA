package com.nsu;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a three-digit integer: ");

        int n = input.nextInt();
//        int temp = n;
//        int rem, ans=0;
//        while (n!=0){
//            rem = n%10;
//            ans = ans*10+rem;
//            n/=10;
//        }

//        if (temp==ans){
//            System.out.println(temp+" is a palindrome");
//        }else System.out.println(temp+" is not a palindrome");

        if (n%10==n/100){
            System.out.println(n+" is a palindrome");
        }else  System.out.println(n+" is not a palindrome");
    }
}
