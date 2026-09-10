# Student Performance and Study Planner

## 1. Project Overview

Student Performance and Study Planner is a Java-based console application designed to help students manage their academic information and organize their study activities.

The application allows users to manage student records, store subject marks, analyze academic performance, create study tasks, set task priorities, and generate a performance report.

The project demonstrates basic Java Object-Oriented Programming concepts along with exception handling and file handling.

---

## 2. Features

### Student Management
- Add student
- View all students
- Search student by ID
- Delete student

### Academic Performance
- Add subject marks
- View subject marks
- Calculate percentage
- Calculate grade
- Identify strong and weak subjects
- Display performance analysis

### Study Planner
- Add study tasks
- Assign task priority
- View study tasks
- Mark tasks as completed
- Delete tasks

### Report Generation
- Generate a summary report containing:
  - Student information
  - Subject performance
  - Overall percentage
  - Grade
  - Performance level
  - Study tasks

### File Storage
The application uses text files to store project data.

---

## 3. Technologies Used

- Java
- Object-Oriented Programming
- Inheritance
- Polymorphism
- Exception Handling
- ArrayList
- File Handling
- Git
- GitHub

---

## 4. Project Structure

```text
Student-Performance-Study-Planner/
│
├── src/
│   ├── Main.java
│   ├── Person.java
│   ├── Student.java
│   ├── Subject.java
│   ├── StudyTask.java
│   ├── InputValidator.java
│   ├── FileManager.java
│   ├── StudentManager.java
│   ├── PerformanceAnalyzer.java
│   ├── StudyPlanner.java
│   └── ReportGenerator.java
│
├── test/
│   └── ProjectTest.java
│
├── docs/
│   └── diagrams.md
│
├── students.txt
├── subjects.txt
├── tasks.txt
├── statement.md
├── README.md
└── .gitignore
