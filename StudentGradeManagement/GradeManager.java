package StudentGradeManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeManager {
    private ArrayList<Student> students;

    public GradeManager() {
        students = new ArrayList<>();
    }

    public void addStudent(String name, String id) {
        // Check if student already exists by ID
        if (getStudentById(id) != null) {
            System.out.println("Student with this ID already exists.");
            return;
        }
        students.add(new Student(name, id));
        System.out.println("Student added successfully.");
    }

    public Student getStudentById(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) return s;
        }
        return null;
    }

    public void addGradeToStudent(String id, double grade) {
        Student student = getStudentById(id);
        if (student == null) {
            System.out.println("Student not found.");
            return;
        }
        student.addGrade(grade);
        System.out.println("Grade added successfully.");
    }

    public void printAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        System.out.println("All Students:");
        for (Student s : students) {
            System.out.println(s.toString());
        }
    }

    public void printStudentGrades(String id) {
        Student student = getStudentById(id);
        if (student == null) {
            System.out.println("Student not found.");
            return;
        }
        System.out.println("Grades for " + student.getName() + ":");
        if (student.getGrades().isEmpty()) {
            System.out.println("No grades recorded.");
        } else {
            for (double g : student.getGrades()) {
                System.out.println(g);
            }
        }
    }
}
