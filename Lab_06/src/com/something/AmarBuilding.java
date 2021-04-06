package com.something;

public class AmarBuilding {
    private int numberOfDoorsPerRoom;
    private int numberOfWindowsPerRoom;
    private int numberOfRooms;
    private String nameOfMyBuilding;

    public AmarBuilding(String name) {
        this.nameOfMyBuilding = name;


    }


    public void setNumberOfDoorsPerRoom(int doors) {
        this.numberOfDoorsPerRoom = doors;
    }

    public void setNumberOfWindowsPerRoom(int windows) {
        this.numberOfWindowsPerRoom = windows;
    }

    public void setNumberOfRooms(int rooms) {
        this.numberOfRooms = rooms;
    }


    public String updateNameOfMyBuilding(String name) {
        return name;


    }


    public int getNumberOfDoorsPerRoom() {
        return numberOfDoorsPerRoom;
    }

    public int getNumberOfWindowsPerRoom() {
        return numberOfWindowsPerRoom;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void calculateAndPrintTotalNumberOfDoorsAndWindowsOfBuilding() {
        int total = this.numberOfDoorsPerRoom + this.numberOfRooms + this.numberOfWindowsPerRoom;

        System.out.println("Total = " + total);
    }
}
