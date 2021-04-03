package com.cse215;

import java.time.LocalDate;
import  java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class MyDate {
    int year;
    int month;
    int day;
    long elapsedTime;

    public MyDate() {
        Date date  =new Date();
        System.out.println(date);
    }

    public  MyDate(long elapsedTime){
        setDate(elapsedTime);

    }


    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public  void setDate(long elapsedTime){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(calendar.YEAR);
        this.month  = calendar.get(calendar.MONTH);
        this.day = calendar.get(calendar.DAY_OF_MONTH);
    }
}
