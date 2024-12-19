package org.dcistudent;

public enum Weekday {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    private final Boolean weekend;

    Weekday(Boolean isWeekend) {
        this.weekend = isWeekend;
    }

    public Boolean isWeekend() {
        return weekend;
    }

    public Boolean isWeekday() {
        return this != SATURDAY && this != SUNDAY;
    }
}
