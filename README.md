# Student Performance and Study Planner

## 1. Project Overview

Student Performance and Study Planner is a Java-based console application designed to help students manage their academic information, track subject marks, analyze their performance, and organize study tasks.

The project demonstrates important Java programming concepts including Object-Oriented Programming, inheritance, polymorphism, exception handling, ArrayList, validation, and file handling.

## 2. Features

### Student Management

* Add student details
* View all students
* Search for a student
* Delete a student
* Store student information in a text file

### Academic Performance

* Add subject marks
* View subject marks
* Calculate total marks
* Calculate percentage
* Determine grades
* Identify the best and focus subjects
* Provide performance recommendations

### Study Planner

* Add study tasks
* View study tasks
* Mark tasks as completed
* Delete study tasks
* Assign LOW, MEDIUM, or HIGH priority

### Performance Analysis and Report

* Analyze overall academic performance
* Display performance level
* Generate a student performance report
* Display completed and pending study tasks

## 3. Technologies Used

* Java
* Object-Oriented Programming
* Inheritance
* Polymorphism
* Exception Handling
* ArrayList
* File Handling
* Text File Storage

## 4. Project Structure

```text
Student-Performance-Study-Planner/
│
├── src/
│   ├── Person.java
│   ├── Student.java
│   ├── Subject.java
│   ├── StudyTask.java
│   ├── InputValidator.java
│   ├── FileManager.java
│   ├── StudentManager.java
│   ├── PerformanceAnalyzer.java
│   ├── StudyPlanner.java
│   ├── ReportGenerator.java
│   └── Main.java
│
├── test/
│   └── ProjectTest.java
│
├── students.txt
├── subjects.txt
├── tasks.txt
├── statement.md
├── README.md
├── .gitignore
└── LICENSE
```

## 5. Requirements

The following software is required:

* Java Development Kit (JDK) 8 or above
* Command Prompt, Terminal, or any Java-supported IDE
* Git

No external libraries or database are required.

## 6. How to Run

### Step 1: Clone the Repository

Open a terminal and run:

```bash
git clone <repository-url>
```

### Step 2: Open the Project Folder

```bash
cd Student-Performance-Study-Planner
```

### Step 3: Compile the Source Files

```bash
javac src/*.java
```

### Step 4: Run the Application

```bash
java -cp src Main
```

## 7. Example Usage

After starting the application, the main menu is displayed:

```text
============== MAIN MENU ==============
1. Student Management
2. Academic Performance
3. Study Planner
4. Performance Analysis
5. Generate Report
6. Exit
=======================================
```

The user can select the required module by entering the corresponding menu number.

## 8. Data Storage

The application uses text files for basic data storage.

* `students.txt` stores student information.
* `subjects.txt` stores subject and marks information.
* `tasks.txt` stores study-task information.

The application does not require a database.

## 9. Validation and Exception Handling

The application validates:

* Student ID
* Student name
* Subject marks
* Task priority
* Numeric menu input

Exception handling is used to prevent invalid numeric input from terminating the application unexpectedly.

## 10. Object-Oriented Programming Concepts

The project demonstrates:

### Encapsulation

Class attributes are declared private and accessed using methods.

### Inheritance

The `Student` class inherits from the `Person` class.

### Polymorphism

The `displayInfo()` method in `Student` overrides the method defined in `Person`.

### Abstraction through Modular Design

Different responsibilities are separated into different classes such as `StudentManager`, `PerformanceAnalyzer`, `StudyPlanner`, and `FileManager`.

## 11. Testing

The project includes basic tests for important functionality such as:

* Student creation
* Subject grade calculation
* Marks validation
* Student ID validation
* Study task creation

The testing class can be compiled and executed from the command line.

## 12. Limitations

* The application currently uses text files instead of a database.
* The application is console-based.
* The study planner does not currently include calendar or reminder functionality.

## 13. Future Enhancements

Possible future improvements include:

* Database integration using MySQL
* Login and authentication
* Graphical user interface
* Automatic study recommendations
* Calendar-based study scheduling
* More detailed performance analytics
* Exporting reports to PDF

## 14. Author

Developed as a Java academic project demonstrating Object-Oriented Programming and basic file handling.
