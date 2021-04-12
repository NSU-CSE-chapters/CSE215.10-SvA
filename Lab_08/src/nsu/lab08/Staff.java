package nsu.lab08;

public class Staff extends Employee {

    private String title;

    public Staff(String name, String address, String phoneNumber, String email, int office, double salary, String title) {
        super(name, address, phoneNumber, email, office, salary);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Staff{" +
                "title='" + title + '\'' +
                '}';
    }
}
