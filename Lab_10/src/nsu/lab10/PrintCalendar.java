package nsu.lab10;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class PrintCalendar extends GregorianCalendar {
    private Calendar calendar;
    private int month;
    private int year;
    private String[] monthName = {"January", "February", "March", "April", "May",
            "June", "July", "August", "September", "October", "November", "December"};
    private int lineCount;

    public PrintCalendar(int month, int year) {
        super();
        this.month = month;
        this.year = year;
        this.calendar = new GregorianCalendar(year, month, 1);
    }

    public void printCalender() {
        System.out.println("\t\t" + monthName[this.month] + " " + this.year);
        System.out.println("---------------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        for (int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++) {
            System.out.print("\t ");
            lineCount++;
        }
        for (int i = 1; i <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
            if ((lineCount % 7) == 0) {
                System.out.println();
            }
            System.out.print(i + "\t ");
            lineCount++;
        }
    }
}
