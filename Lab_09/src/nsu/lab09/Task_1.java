package nsu.lab09;

import java.util.ArrayList;
import java.util.Date;

public class Task_1 {
    public static void main(String[] args) {

        ArrayList<Object> objects = new ArrayList<>();

        objects.add(new Loan(2000,5));
        objects.add(new MyDate());
        objects.add("Fahim Muntashir");
        objects.add(new Circle(5.0));

        for (int i = 0; i < objects.size(); i++) {
            System.out.println(objects.get(i).toString());
        }
    }


}




