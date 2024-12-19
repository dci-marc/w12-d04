package org.dcistudent;

public class Students {
    public static void main(String[] args) {
        new Students();
    }

    public Students() {
        Student student1 = new Student("John Doe", 90, "A", "Math", "USA");
        Student student2 = new Student("Jane Doe", 80, "B", "Science", "Canada");
        Student student3 = new Student("John Doe", 90, "A", "Math", "USA");

        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);
        System.out.println("Student 3: " + student3);
        System.out.println("Student 1 equals Student 2: " + student1.equals(student2));
        System.out.println("Student 1 equals Student 3: " + student1.equals(student3));
        System.out.println("Students teacher: " + Student.getTeacher());
    }
}
