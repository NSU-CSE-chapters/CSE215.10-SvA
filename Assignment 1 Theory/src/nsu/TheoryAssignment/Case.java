package nsu.TheoryAssignment;

/*
    Name: Fahim Muntashir
    ID: 2021183
    Course: CSE215
    Section: 10

*/


import java.util.Scanner;

public class Case {
    public final int fakeSuspect = 0;
    public final int finalSuspect = 1;
    private int finalCaseSuspect;

    private static int count = 0;
    private int id = 0;

    // maintain the unique case id
    public Case() {
        id = count++;

    }

    public int getId() {
        return id;
    }

    public String getFinalSuspect() {

        switch (finalCaseSuspect) {
            case 0:
                return "released";
            case 1:
                return "culprit";
            default:
                return "not found";
        }
    }

    public void setFinalCaseSus(int finalCaseSus) {
        this.finalCaseSuspect = finalCaseSus;
    }

    Scanner input = new Scanner(System.in);

    Client client = new Client(input.next(), input.nextInt(), input.next());
    Suspect suspect = new Suspect(input.next(), input.nextInt(), input.next(), input.next(), input.next());

    CaseDetails caseDetails = new CaseDetails(input.nextInt(), input.next(), input.next());


    @Override
    public String toString() {
        return "CaseManagement{" +
                " Case ID= " + getId() +
                ", " + client.toString() +
                ", " + suspect.toString() +
                ", " + caseDetails.toString() +
                ", " + getFinalSuspect() +
                '}';
    }
}
