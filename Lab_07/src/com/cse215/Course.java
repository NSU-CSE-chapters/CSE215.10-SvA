package com.cse215;

public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {

    }

    public void dropStudent(String student) {

    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void clear() {

    }
}
