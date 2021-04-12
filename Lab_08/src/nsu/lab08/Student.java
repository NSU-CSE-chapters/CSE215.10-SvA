package nsu.lab08;

public class Student extends Person {
    private int status;
    public final int freshman = 1;
    public final int sophomore = 2;
    public final int junior = 3;
    public final int senior = 4;


    public Student(String name, String address, String phoneNumber, String email, int status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatus() {
        switch (status) {
            case 1:
                return "freshman";
            case 2:
                return "sophomore";
            case 3:
                return "junior";
            case 4:
                return "senior";
            default: return "unknown";
        }
    }


    public String toString() {
        return super.toString()+"\nstatus: "+getStatus();
    }
}
