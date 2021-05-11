package nsu.helpingHand;

public class Patient {
    private String name;
    private int age;
    private String disease;

    private  static  int numberOfPatient = 0;

    public Patient() {
        this.name = "unknown";
        this.age = 0;
        this.disease = "no disease";
        numberOfPatient++;
    }

    public Patient(String name, int age, String disease) throws InvalidNameException {
        setName(name);
        setAge(age);
        this.disease = disease;
        numberOfPatient++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidNameException {
        if (name.length() >= 3) {
            this.name = name;
        } else
            throw new InvalidNameException(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
       if (age>0){
           this.age  =age;
       }else throw  new IllegalArgumentException("illegal argument exception");
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public static int getNumberOfPatient() {
        return numberOfPatient;
    }
}
