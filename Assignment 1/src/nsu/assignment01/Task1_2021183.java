package nsu.assignment01;

import java.util.Scanner;

public class Task1_2021183 {
    // main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] studentsMarks = new int[4][4]; // marks of the students

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter four weeks marks, student " + i + ": ");
            for (int j = 0; j < studentsMarks[i].length; j++) {
                studentsMarks[i][j] = input.nextInt();
            }
        }
        System.out.println();
        // print the student, week and total marks
        System.out.println("Student\t\tWeek\t\t\tTotal");
        System.out.println("\t\t0\t1\t2\t3");
        for (int i = 0; i < 4; i++) {
            System.out.print(i + "\t\t");
            for (int j = 0; j < 4; j++) {
                System.out.print(studentsMarks[i][j] + "\t");
            }
            System.out.print("\t" + calcNum(studentsMarks, i));
            System.out.println();
        }
        System.out.println();

        // total class and average
        System.out.println("Class Total: " + classTotal(studentsMarks));
        System.out.println("Class Average: " + totalAvg(studentsMarks));


    }

    // weekly total mark
    public static int calcNum(int[][] number, int col) {
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            sum += number[col][i];
        }
        return sum;

    }

    // total class mark
    public static int classTotal(int[][] numbers) {
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            sum += calcNum(numbers, i);
        }
        return sum;
    }

    // total average
    public static double totalAvg(int[][] numbers) {
        double sum = 0;

        for (int i = 0; i < 4; i++) {
            sum += calcNum(numbers, i);
        }
        double avg;

        avg = sum / numbers.length;
        return avg;
    }

}
