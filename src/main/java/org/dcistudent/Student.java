package org.dcistudent;

import lombok.NonNull;

import java.util.Arrays;

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
        try {
            StudentGrades.valueOf(gradeLetter);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(
                    "Grade letter must be " + String.join(",", Arrays.toString(StudentGrades.values())) + "."
            );
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
