package nsu.lab11;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        try{
            double breadth = input.nextDouble();
            double height = input.nextDouble();
            System.out.println(breadth*height);


        }catch (Exception exception){
            System.out.println("Breadth and height must be positive");
        }
    }
}
