package nsu.TheoryAssignment;


/*
    Name: Fahim Muntashir
    ID: 2021183
    Course: CSE215
    Section: 10

*/

public class Suspect extends Person {


    private String occupation;
    private String currentLocation;

    // Suspect have mimimum a name, age, phoneNumber, occupation and currentLocation
    public Suspect(String name, int age, String phoneNumber, String occupation, String currentLocation) {
        super(name, age, phoneNumber);
        this.occupation = occupation;
        this.currentLocation = currentLocation;
    }

    public Suspect(String name, int age, String address, String phoneNumber, String email, String occupation, String currentLocation) {
        super(name, age, address, phoneNumber, email);
        this.occupation = occupation;
        this.currentLocation = currentLocation;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public String toString() {
        return "Suspect{" +
                " name='" + getName() + '\'' +
                ", age='" + getAge() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +

                ", occupation='" + occupation + '\'' +
                ", currentLocation='" + currentLocation + '\'' +
                '}';
    }
}
