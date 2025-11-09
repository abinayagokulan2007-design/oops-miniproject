package model;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, String id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher: " + name + " | ID: " + id + " | Subject: " + subject);
    }
}
