package model;

public class Student extends Person {
    private String grade;

    public Student(String name, String id, String grade) {
        super(name, id);
        this.grade = grade;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student: " + name + " | ID: " + id + " | Grade: " + grade);
    }
}
