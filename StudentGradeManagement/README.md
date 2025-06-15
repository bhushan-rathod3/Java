Student Grade Management System
Overview
This Java project implements a Student Grade Management System, a console-based application designed to manage student information and their academic grades. It showcases fundamental to intermediate Java concepts such as classes, objects, loops, conditional statements, methods, and basic data structures (ArrayList). The system provides a clear, logical structure for organizing and processing student data, demonstrating how to build functional Java applications.

Features
Add Student: Enroll new students into the system with their name and a unique ID.

Add Grade: Assign grades to existing students for their subjects or assignments.

View All Students: Display a list of all registered students along with their average grades.

View Student Grades: See all individual grades recorded for a specific student.

Input Validation: Basic checks for grade ranges and numeric input.

Folder Structure
StudentGradeManagement/
├── Student.java
├── GradeManager.java
├── Main.java
└── README.md

Student.java: Defines the Student class, managing student's name, ID, and a list of their grades. It also calculates the average grade.

GradeManager.java: Defines the GradeManager class, responsible for managing a collection of Student objects. It handles operations like adding students, adding grades, and retrieving student information.

Main.java: Contains the main method, providing the console-based user interface for interacting with the GradeManager.

README.md: This file, providing project information and instructions.

How to Run
To compile and run this project, follow these steps:

Save the files: Save Student.java, GradeManager.java, and Main.java directly inside the StudentGradeManagement parent folder (e.g., D:\IntelliJ Idea\Java\Java\StudentGradeManagement\).

Open Terminal/Command Prompt:

Navigate into the StudentGradeManagement directory.

For example, if your current path is D:\IntelliJ Idea\Java\Java>, type:

cd StudentGradeManagement

Your terminal prompt should now show D:\IntelliJ Idea\Java\Java\StudentGradeManagement>.

Compile the Java files:

javac \*.java

This command compiles all .java files in the current directory. If successful, it will create Student.class, GradeManager.class, and Main.class in the same folder.

Run the application:

java Main

This command executes the Main class, starting the console application. It will look for Main.class in the current directory.

Example Walkthrough
Here's a sample interaction demonstrating the application's functionality:

--- Student Grade Management ---

1. Add Student
2. Add Grade to Student
3. View All Students
4. View Student Grades
5. Exit
   Choose an option: 1
   Enter student name: Alice
   Enter student ID: S001
   Student added successfully.

--- Student Grade Management ---

1. Add Student
2. Add Grade to Student
3. View All Students
4. View Student Grades
5. Exit
   Choose an option: 1
   Enter student name: Bob
   Enter student ID: S002
   Student added successfully.

--- Student Grade Management ---

1. Add Student
2. Add Grade to Student
3. View All Students
4. View Student Grades
5. Exit
   Choose an option: 2
   Enter student ID: S001
   Enter grade (0-100): 85.5
   Grade added successfully.

--- Student Grade Management ---

1. Add Student
2. Add Grade to Student
3. View All Students
4. View Student Grades
5. Exit
   Choose an option: 2
   Enter student ID: S001
   Enter grade (0-100): 92
   Grade added successfully.

--- Student Grade Management ---

1. Add Student
2. Add Grade to Student
3. View All Students
4. View Student Grades
5. Exit
   Choose an option: 2
   Enter student ID: S002
   Enter grade (0-100): 78
   Grade added successfully.

--- Student Grade Management ---

1. Add Student
2. Add Grade to Student
3. View All Students
4. View Student Grades
5. Exit
   Choose an option: 3
   All Students:
   Student ID: S001, Name: Alice, Average Grade: 88.75
   Student ID: S002, Name: Bob, Average Grade: 78.00

--- Student Grade Management ---

1. Add Student
2. Add Grade to Student
3. View All Students
4. View Student Grades
5. Exit
   Choose an option: 4
   Enter student ID: S001
   Grades for Alice:
   85.5
   92.0

--- Student Grade Management ---

1. Add Student
2. Add Grade to Student
3. View All Students
4. View Student Grades
5. Exit
   Choose an option: 5
   Exiting. Goodbye!

Technologies Used
Java SE
