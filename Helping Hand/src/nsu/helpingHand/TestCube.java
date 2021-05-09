package nsu.helpingHand;

import java.util.Scanner;

public class TestCube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter the side of the cube1: ");
        double cubeInput1 = input.nextDouble();
        Cube cube1 = new Cube(cubeInput1);

        System.out.print("enter the side of the cube2: ");
        double cubeInput2 = input.nextDouble();

        Cube cube2 = new Cube(cubeInput2);

        System.out.print("enter the side of the cube3: ");
        double cubeInput3 = input.nextDouble();

        Cube cube3 = new Cube(cubeInput3);


        double add = cube1.printVolume()+cube2.printVolume()+cube3.printVolume();

        System.out.println("total volume: "+add);


    }


}
