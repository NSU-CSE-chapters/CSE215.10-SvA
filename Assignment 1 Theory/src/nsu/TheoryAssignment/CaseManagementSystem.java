package nsu.TheoryAssignment;

/*
    Name: Fahim Muntashir
    ID: 2021183
    Course: CSE215
    Section: 10

*/


import java.util.ArrayList;
import java.util.Scanner;

public class CaseManagementSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Object> caseRecord = new ArrayList<>();
        System.out.println("**************** Case Management System ******************");


        // loop until exit from the program
        while (true) {
            display();
            int n = input.nextInt();


            if (n == 1) {

                System.out.println("1. Open");
                System.out.println("2. Close");

                System.out.print("Open or Close? : ");
                int check = input.nextInt();

                // opening new case
                if (check == 1) {
                    System.out.println("******** Enter the Information of the case ******** ");
                    System.out.println("Client Information: name? age? phoneNumber? occupation");
                    System.out.println("Suspect information: name? age? phoneNumber? occupation? currentLocation? ");
                    System.out.println("Case Description: caseType? caseLocation? caseDetails? ");

                    Case caseManagement = new Case();
                    caseRecord.add(caseManagement);

                    System.out.println("Case added succeessfully, any furthur information, we will contact with you....");
                    System.out.println();

                }
                // for closing a case
                else if (check == 2) {
                    if (caseRecord.size() == 0) {
                        System.out.println("no case data available... ");
                    } else {
                        System.out.print("enter case ID number: ");
                        int caseId = input.nextInt();
                        caseRecord.remove(caseId);
                    }

                } else display();


            }
            // modify a case information
            else if (n == 2) {
                System.out.print("enter the case ID that you want to modify? : ");
                int modifyID = input.nextInt();
                if (caseRecord.contains(modifyID)) {
                    System.out.println("enter the modified information: ");
                    System.out.println("Client Information: name? age? phoneNumber? ");

                    Client client = new Client(input.next(), input.nextInt(), input.next());
                    caseRecord.add(client);
                    System.out.println("Suspect information: name? age? phoneNumber? occupation? currentLocation? ");
                    Suspect suspect = new Suspect(input.next(), input.nextInt(), input.next(), input.next(), input.next());
                    caseRecord.add(suspect);
                    System.out.println("Case Description: caseType? caseLocation? caseDetails? ");
                    CaseDetails caseDetails = new CaseDetails(input.nextInt(), input.next(), input.next());
                    caseRecord.add(caseDetails);

                    System.out.println("modify successfully ....");

                } else System.out.println("id not found");
            }
            // display the case list
            else if (n == 3) {
                if (caseRecord.size() == 0) {
                    System.out.println("no case record found");
                    System.out.println();
                }

                for (int i = 0; i < caseRecord.size(); i++) {
                    m(caseRecord.get(i));

                }
                System.out.println();


            } else if (n == 4) {
                System.exit(0);

            } else {
                System.out.println("invalid number... try again");
                System.out.println();
            }
        }

    }

    public static void m(Object o) {
        System.out.println(o.toString());
    }

    // Main Menu
    public static void display() {
        System.out.println("1. Enter a new case");
        System.out.println("2. Modify a case");
        System.out.println("3. Display the case");
        System.out.println("4. Exit");
        System.out.println();

        System.out.print("your choice: ");

    }
}
