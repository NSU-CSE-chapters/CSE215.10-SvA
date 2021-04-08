package nsu.helpingHand;

public class Student {
    private int id;
    private String  department;
    private double quizmarks;


    public Student() {
        this.id = 1;
        this.department = "ece";
        this.quizmarks = 0.0;

    }

    public Student(int id, String department, double quizmarks) {
        this.id = id;
        this.department = department;
        this.quizmarks = quizmarks;
    }

    public double getQuizmarks() {
        return quizmarks;
    }


    public  String toString() {
        return "Student{" +
                "id=" + id +
                ", department='" + department + '\'' +
                ", quizmarks=" + quizmarks +
                '}';
    }
}
