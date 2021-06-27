package nsu.TheoryAssignment;


/*
    Name: Fahim Muntashir
    ID: 2021183
    Course: CSE215
    Section: 10

*/


public class Client extends Person {
    private String occupation;

    // Client should have minimum  a name, age and  phoneNumber
    public Client(String name, int age, String phoneNumber) {
        super(name, age, phoneNumber);
    }

    public Client(String name, int age, String address, String phoneNumber, String email, String occupation) {
        super(name, age, address, phoneNumber, email);
        this.occupation = occupation;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return " Client{" +
                " name='" + getName() + '\'' +
                ", age='" + getAge() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +

                ", occupation='" + occupation + '\'' +
                '}';
    }
}
