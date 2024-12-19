package org.dcistudent;

public class Weekdays {
    public static void main(String[] args) {
        new Weekdays();
    }

    public Weekdays() {
        Weekday[] weekdays = Weekday.values();
        for (Weekday weekday : weekdays) {
            System.out.println(weekday + " is weekend: " + weekday.getWeekend());
        }
    }
}
