package nsu.lab09;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five integers for list1: ");
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list1.add(input.nextInt());
        }


        System.out.print("Enter five integers for list2: ");
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list2.add(input.nextInt());
        }

        ArrayList<Integer> integers = union(list1,list2);
        System.out.print("The combined list is ");
        for (int i = 0; i < integers.size(); i++) {
            System.out.print(integers.get(i)+" ");
        }
        System.out.println();

    }


    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.addAll(list1);
        integers.addAll(list2);
        return integers;
    }
}
