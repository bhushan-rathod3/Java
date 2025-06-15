package StudentGradeManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GradeManager manager = new GradeManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Student Grade Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. Add Grade to Student");
            System.out.println("3. View All Students");
            System.out.println("4. View Student Grades");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    String id = scanner.nextLine();
                    manager.addStudent(name, id);
                    break;
                case 2:
                    System.out.print("Enter student ID: ");
                    String studentId = scanner.nextLine();
                    System.out.print("Enter grade (0-100): ");
                    double grade;
                    try {
                        grade = Double.parseDouble(scanner.nextLine());
                        if (grade < 0 || grade > 100) {
                            System.out.println("Grade must be between 0 and 100.");
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid grade input.");
                        break;
                    }
                    manager.addGradeToStudent(studentId, grade);
                    break;
                case 3:
                    manager.printAllStudents();
                    break;
                case 4:
                    System.out.print("Enter student ID: ");
                    String sid = scanner.nextLine();
                    manager.printStudentGrades(sid);
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}
