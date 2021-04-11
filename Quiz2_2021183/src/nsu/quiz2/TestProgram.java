package nsu.quiz2;

import java.util.Scanner;

public class TestProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Cellphone[] cellphones = new Cellphone[5];
        double sum = 0;
        for (int i = 0; i < cellphones.length; i++) {
            double x = input.nextDouble();
            cellphones[i] = new Cellphone(x);
            sum+= cellphones[i].getCall_duration();
        }
        double avg = sum/ Cellphone.numberOfCalls;
        System.out.println("avg call duration= "+ avg);
        }
}
