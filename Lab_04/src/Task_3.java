/*
(Palindrome integer) Write the methods with the following headers
// Return the reversal of an integer, i.e., reverse (456) returns 654
public static int reverse(int number)
// Return true if number is a palindrome
public static boolean isPalindrome(int number)

Page 2 of 3
Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is the
same as itself. Write a test program that prompts the user to enter an integer and reports whether the
integer is a palindrome.
*/

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        System.out.print("Enter an Integer: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (isPalindrome(n)) {
            System.out.println("palindrome");
        } else System.out.println("Not a palindrome");

    }

    public static int reverse(int number) {
        int rem, rev = 0;

        while (number > 0) {
            rem = number % 10;
            rev = rev * 10 + rem;
            number /= 10;
        }

        return rev;
    }

    public static boolean isPalindrome(int number) {
        if (number == reverse(number)) {
            return true;
        } else return false;
    }


}
