package nsu.assignment01;

import java.util.Scanner;

public class Task2_2021183 {
    // main class
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean[][] arr = new boolean[5][5];
        // user input
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("arr[%d][%d]: ", i, j);
                arr[i][j] = input.nextBoolean();
            }
        }

        // formatting the output
        System.out.print("#\t0\t1\t2\t3\t4");
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(i + "\t");
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == true) {
                    System.out.print("*\t");
                } else System.out.print("\t");
            }
            System.out.println();
        }
        // total pairs of friends
        System.out.println();
        System.out.println("There are " + countPairOfFriends(arr) + " pairs of friends.");

    }

    // count number of friends pairs
    public static int countPairOfFriends(boolean[][] friend) {

        int count = 1;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ((friend[i][j] && friend[j][i]) == true) {
                    count++;
                }
            }
        }
        return count;
    }
}



