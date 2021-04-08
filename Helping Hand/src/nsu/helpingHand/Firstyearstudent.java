package nsu.helpingHand;

public class Firstyearstudent extends Student {

    private double finalmarks;


    Firstyearstudent() {
        super();
        this.finalmarks = 0.0;
    }

    public Firstyearstudent(int id, String department, double quizmarks, double finalmarks) {
        super(id, department, quizmarks);
        this.finalmarks = finalmarks;
    }


    public double totalMarks() {
        return getQuizmarks() + finalmarks;
    }


    @Override
    public String toString() {
        return "Firstyearstudent{" +
                "finalmarks=" + finalmarks +
                '}';
    }
}
