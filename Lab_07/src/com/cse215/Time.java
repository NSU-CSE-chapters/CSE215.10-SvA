package com.cse215;

public class Time {
    private int hour;
    private int minutes;
    private int second;
    private long currentTime;

    public Time() {
        currentTime = System.currentTimeMillis();

    }

    public Time(long time) {
        this.currentTime = time;

    }

    public Time(int hour, int minutes, int second) {
        this.hour = hour;
        this.minutes = minutes;
        this.second = second;
    }


    public void setTime(long elapseTime) {
        this.currentTime = elapseTime;
    }

    public int getHour() {
        return (int) (currentTime / (1000 * 60 * 60)) % 24;
    }

    public int getMinutes() {
        return (int) (currentTime / (1000 * 60)) % 60;
    }

    public int getSecond() {
        return (int) (currentTime / (1000)) % 60;
    }


}
