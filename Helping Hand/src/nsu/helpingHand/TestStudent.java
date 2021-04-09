package nsu.helpingHand;

public class TestStudent {
    public static void main(String[] args) {
        Firstyearstudent student1 = new Firstyearstudent(1,"CSE",8.5,84.5);
        Firstyearstudent student2 = new Firstyearstudent(1,"EEE",6,86);
        Firstyearstudent student3 = new Firstyearstudent(1,"CSE",8.5,78);

        System.out.println("student 1: total marks = "+student1.totalMarks());
        System.out.println("student 2: total marks = "+student2.totalMarks());
        System.out.println("student 3: total marks = "+student3.totalMarks());
    }
    int i  = 0 ;


}


i