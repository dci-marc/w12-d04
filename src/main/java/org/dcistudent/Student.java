package org.dcistudent;

import lombok.NonNull;

@NonNull
public record Student(String name, Integer grade, String gradeLetter, String course, String country) {
    private static final String TEACHER = "Omar";

    public Student {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }
        if (gradeLetter.isBlank()) {
            throw new IllegalArgumentException("Grade letter cannot be blank");
        }
        if (course.isBlank()) {
            throw new IllegalArgumentException("Course cannot be blank");
        }
        if (country.isBlank()) {
            throw new IllegalArgumentException("Country cannot be blank");
        }
    }

    public static String getTeacher() {
        return TEACHER;
    }
}
