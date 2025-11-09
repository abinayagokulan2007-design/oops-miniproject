package services;

public class ThreadedScheduler extends Thread {
    private String taskName;

    public ThreadedScheduler(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(taskName + " running step " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}
