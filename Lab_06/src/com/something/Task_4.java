

package com.something;

public class Task_4 {
    public static void main(String[] args) {

        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.turnOn();

        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.turnOff();

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());


    }
}
