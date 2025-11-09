package services;

import java.util.*;
import utils.TimetableException;

public class Timetable {
    private Map<String, List<String>> schedule = new HashMap<>();

    public void addSlot(String day, String slot) throws TimetableException {
        if (schedule.containsKey(day) && schedule.get(day).contains(slot)) {
            throw new TimetableException("❌ Slot already taken on " + day + ": " + slot);
        }
        schedule.computeIfAbsent(day, k -> new ArrayList<>()).add(slot);
    }

    public void displaySchedule() {
        schedule.forEach((day, slots) ->
            System.out.println(day + " -> " + slots)
        );
    }
}
