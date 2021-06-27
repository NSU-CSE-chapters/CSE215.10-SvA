package nsu.TheoryAssignment;


/*
    Name: Fahim Muntashir
    ID: 2021183
    Course: CSE215
    Section: 10

*/


import java.util.Date;

public class CaseDetails {


    // types of case
    public final int CRIMINAL = 1;
    public final int CIVIL = 2;
    public final int FAMILY = 3;

    private Date todaysDate;
    private int caseType;
    private String caseLocation;
    private String caseDescriptions;


    public CaseDetails(int caseType, String caseLocation, String caseDescriptions) {
        this.todaysDate = new Date();
        this.caseType = caseType;
        this.caseLocation = caseLocation;
        this.caseDescriptions = caseDescriptions;
        this.todaysDate = new Date();


    }

    public Date getTodaysDate() {
        return todaysDate= new Date();
    }


    public String getCaseType() {
        switch (caseType) {
            case 1:
                return "CRIMINAL";
            case 2:
                return "CIVIL";
            case 3:
                return "FAMILY";
            default:
                return "Normal";
        }
    }

    public void setCaseType(int caseType) {
        this.caseType = caseType;
    }

    public String getCaseLocation() {
        return caseLocation;
    }

    public void setCaseLocation(String caseLocation) {
        this.caseLocation = caseLocation;
    }

    public String getCaseDescriptions() {
        return caseDescriptions;
    }

    public void setCaseDescriptions(String caseDescriptions) {
        this.caseDescriptions = caseDescriptions;
    }

    @Override
    public String toString() {
        return "CaseDetails{" +
                " CaseEntryDate=" + todaysDate +
                ", caseType=" + getCaseType() +
                ", caseLocation='" + caseLocation + '\'' +
                ", caseDescriptions='" + caseDescriptions + '\'' +
                '}';
    }
}
