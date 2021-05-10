package nsu.lab11;

import java.util.Random;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
            int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] =(int) ((Math.random()*100)+1);
        }
        

        System.out.print("enter the index of the array: ");
        int value  = input.nextInt();
        try{
            System.out.println(array[value]);
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("Out of Bounds.");
        }
    }
}
