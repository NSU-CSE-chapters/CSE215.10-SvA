package nsu.lab08;

import java.util.Date;

public class Employee extends Person {
    private int office;
    private double salary;
    private MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String email, int office, double salary) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = new MyDate();
    }

    public int getOffice() {
        return office;
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDateHired() {
        return dateHired.getYear() + "/" + dateHired.getMonth() + "/" + dateHired.getDay();
    }

    @Override
    public String toString() {
        return super.toString() + "/n" + "Employee{" +
                "office=" + getOffice() +
                ", salary=" + getSalary() +
                ", dateHired=" +getDateHired() +
                '}';
    }
}
