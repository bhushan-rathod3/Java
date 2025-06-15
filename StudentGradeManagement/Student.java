package StudentGradeManagement;

import java.util.ArrayList;

public class Student {
    private String name;
    private String id;
    private ArrayList<Double> grades;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) return 0.0;

        double sum = 0.0;
        for (double g : grades) {
            sum += g;
        }
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name + ", Average Grade: " + String.format("%.2f", getAverageGrade());
    }
}
