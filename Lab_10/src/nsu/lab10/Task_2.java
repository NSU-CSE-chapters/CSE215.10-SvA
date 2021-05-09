package nsu.lab10;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //PrintCalendar calendar = new PrintCalendar(input.nextInt(), input.nextInt());
        PrintCalendar calendar1 = new PrintCalendar(3, 2021);
        calendar1.printCalender();
    }
}

