package org.dcistudent;

public enum Weekday {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    private final Boolean isWeekend;

    Weekday(Boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public Boolean isWeek() {
        return isWeekend;
    }
}
