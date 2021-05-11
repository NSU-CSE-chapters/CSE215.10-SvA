package nsu.helpingHand;

import java.net.ServerSocket;
import java.util.Scanner;

public class TestProgram {

    public static void main(String[] args) throws InvalidNameException {
        try {
            Patient patient3 = new Patient("boltu", 56, "cancer");

            Patient patient1 = new Patient("bo", -5, "heart");
            Patient patient2 = new Patient("a", 15, "brain");

        } catch (InvalidNameException e) {
            System.out.println(e);
        }

        System.out.println(Patient.getNumberOfPatient());
    }

}
