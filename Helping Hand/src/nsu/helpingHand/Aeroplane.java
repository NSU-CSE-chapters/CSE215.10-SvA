//package nsu.helpingHand;
//// class
//public class Aeroplane {
//    private String model;
//    private int capacity;
//    private String  pilot;
//    // no arg constructor
//    public Aeroplane() {
//        this.model = "Boeing";
//        this.capacity = 60;
//    }
//
//    // parameterized constructor
//    public Aeroplane(String model, int capacity, String pilot) {
//        this.model = model;
//        this.capacity = capacity;
//        this.pilot = pilot
//    }
//
//
//    // getter and setter method
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public int getCapacity() {
//        return capacity;
//    }
//
//    public void setCapacity(int capacity) {
//        this.capacity = capacity;
//    }
//
//    public String getPilot() {
//        return pilot;
//    }
//
//    public void setPilot(String pilot) {
//        this.pilot = pilot;
//    }
//
//    // toString method
//    @Override
//    public String toString() {
//        return "Aeroplane{" +
//                "model='" + model + '\'' +
//                ", capacity=" + capacity +
//                ", pilot='" + pilot + '\'' +
//                '}';
//    }
//}
//
//class Flight{
//
//    private String destination;
//    private String departureTime;
//
//    // no arg constructor
//
//    public Flight() {
//        this.destination = "no destination selected";
//        this.departureTime = "0 a.m";
//    }
//
//    // parametezied  constructor
//
//    public Flight(String destination, String departureTime) {
//        this.destination = destination;
//        this.departureTime = departureTime;
//    }
//
//    public String getDestination() {
//        return destination;
//    }
//
//    public void setDestination(String destination) {
//        this.destination = destination;
//    }
//
//    public String getDepartureTime() {
//        return departureTime;
//    }
//
//    public void setDepartureTime(String departureTime) {
//        this.departureTime = departureTime;
//    }
//
//    @Override
//    public String toString() {
//        return "Flight{" +
//                "destination='" + destination + '\'' +
//                ", departureTime='" + departureTime + '\'' +
//                '}';
//    }
//}
//
//class Pilot {
//    private String name;
//    private String address;
//    private String phoneNumber;
//
//
//    public Pilot() {
//        this.name = "unknown";
//        this.address = "unknown";
//        this.phoneNumber = "not added any phone number";
//    }
//
//    public Pilot(String name, String address, String phoneNumber) {
//        this.name = name;
//        this.address = address;
//        this.phoneNumber = phoneNumber;
//    }
//
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    @Override
//    public String toString() {
//        return "Pilot{" +
//                "name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                ", phoneNumber='" + phoneNumber + '\'' +
//                '}';
//    }
//}
//
