package gui;

import javax.swing.*;
import java.awt.*;

public class TimetableUI {
    public void showUI() {
        JFrame frame = new JFrame("School Timetable");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea textArea = new JTextArea("Sample Timetable:\nMonday - Maths\nTuesday - Science");
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
