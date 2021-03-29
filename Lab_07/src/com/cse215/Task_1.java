package com.cse215;

public class Task_1 {
    public static void main(String[] args) {
        Time time = new Time();
        Time elapseTime = new Time(555550000);

        System.out.println(time.getHour()+":"+time.getMinutes()+":"+time.getSecond());
//        System.out.println("current time: "+System.currentTimeMillis());
        System.out.println("elapsedTime: ");
        System.out.println("Hour: "+elapseTime.getHour());
        System.out.println("Minutes: "+elapseTime.getMinutes());
        System.out.println("Second: "+elapseTime.getSecond());



    }
}
