package model;

public class ScheduleSlot {
    private String day;
    private String time;
    private String subject;
    private String teacherId;

    public ScheduleSlot(String day, String time, String subject, String teacherId) {
        this.day = day;
        this.time = time;
        this.subject = subject;
        this.teacherId = teacherId;
    }

    public void displaySlot() {
        System.out.println(day + " | " + time + " | " + subject + " | Teacher ID: " + teacherId);
    }
}
