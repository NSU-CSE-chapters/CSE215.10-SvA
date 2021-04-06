package com.something;

import java.util.Scanner;

public class AmarBuildingTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        AmarBuilding amarBuilding = new AmarBuilding("Mormo Villa");

        int numberOfDoors = input.nextInt();
        int numberOfWindows = input.nextInt();
        int numberOfRooms = input.nextInt();

        amarBuilding.setNumberOfDoorsPerRoom(numberOfDoors);
        amarBuilding.setNumberOfWindowsPerRoom(numberOfWindows);
        amarBuilding.setNumberOfRooms(numberOfRooms);

        System.out.println("number of doors: "+amarBuilding.getNumberOfDoorsPerRoom());
        System.out.println("number of rooms: "+amarBuilding.getNumberOfRooms());
        System.out.println("number of windows: "+amarBuilding.getNumberOfWindowsPerRoom());
    }
}
