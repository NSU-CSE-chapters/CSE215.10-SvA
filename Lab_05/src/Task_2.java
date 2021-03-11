import java.util.Scanner;

/*
(Count occurrence of numbers) Write a program that reads the integers between 1 and 100 and counts the
occurrences of each. Assume the input ends with 0. Here is a sample run of the program:
 */
public class Task_2 {
    public static void main(String[] args) {
        System.out.print("Enter the integers between 1 and 100: ");
        int[] count = new int[100];
        Scanner input = new Scanner(System.in);

        int n;

        while ((n = input.nextInt()) != 0) {
            count[n]++;

//                n= input.nextInt();
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                System.out.print((i ) + " occurs " + count[i] + " ");
                if (count[i] > 1) {
                    System.out.println("times");
                } else System.out.println("time");
            }
        }


    }
}
