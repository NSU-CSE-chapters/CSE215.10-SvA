package nsu.helpingHand;

import java.net.ServerSocket;
import java.util.Scanner;

public class TestProgram {

    public static void main(String[] args) {

        MySequence mySequence = new MySequence();

        mySequence.tostring(4);

        Series series = new Series();
        System.out.println();

        series.tostring(5);
    }

}
