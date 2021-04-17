package nsu.lab09;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        System.out.println("Enter 5 numbers:");

        Scanner input = new Scanner(System.in);

        ArrayList<Double> numbers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            numbers.add(input.nextDouble());
        }

        System.out.println("Sum= "+sum(numbers));
    }

    public static double sum(ArrayList<Double> list){
        double sum  = 0;

        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);
        }

        return sum;
    }
}
