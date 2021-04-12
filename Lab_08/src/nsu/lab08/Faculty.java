package nsu.lab08;

import java.util.Date;

public class Faculty extends Employee {
    private String officeHour;
    private int rank;

    public Faculty(String name, String address, String phoneNumber, String email, int office, double salary, String officeHour, int rank) {

        super(name, address, phoneNumber, email, office, salary);
        this.officeHour = officeHour;
        this.rank = rank;
    }

    public String getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHour(String officeHour) {
        this.officeHour = officeHour;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Faculty{" +
                "officeHour='" + officeHour + '\'' +
                ", rank=" + rank +
                '}';
    }
}
