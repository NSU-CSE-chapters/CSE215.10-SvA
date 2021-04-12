package nsu.lab08;

import java.time.Period;

public class TestPersonClass {
    public static void main(String[] args) {
        Person person = new Person("Fahim","Mohammadpur","0187978","f12r.me@gmail.com");
        Student student = new Student("Mormo","Mohammadpur","26558", "@jcccc",3);
        Employee employee = new Employee("Silvia Mam","basundhara","855","@ddd",258,500000);
        Faculty faculty = new Faculty("Sva","Basundhara","258","@",89,1000000,"10pm",2);
        Staff staff = new Staff("unknown","aaa","2222","@",05,600000,"Professor");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
