import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static StudentManager studentManager = new StudentManager();

    static ArrayList<Subject> subjects = new ArrayList<>();

    static StudyPlanner studyPlanner = new StudyPlanner();

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("     STUDENT PERFORMANCE & STUDY PLANNER");
        System.out.println("==============================================");

        boolean running = true;

        while (running) {

            displayMainMenu();

            int choice = readInteger("Enter your choice: ");

            switch (choice) {

                case 1:
                    studentManagement();
                    break;

                case 2:
                    academicPerformance();
                    break;

                case 3:
                    studyPlannerMenu();
                    break;

                case 4:
                    PerformanceAnalyzer.displayAnalysis(subjects);
                    break;

                case 5:
                    generateReport();
                    break;

                case 6:
                    running = false;
                    System.out.println("Thank you for using the application!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    // ================= MAIN MENU =================

    public static void displayMainMenu() {

        System.out.println();
        System.out.println("============== MAIN MENU ==============");
        System.out.println("1. Student Management");
        System.out.println("2. Academic Performance");
        System.out.println("3. Study Planner");
        System.out.println("4. Performance Analysis");
        System.out.println("5. Generate Report");
        System.out.println("6. Exit");
        System.out.println("=======================================");
    }

    // ================= STUDENT MANAGEMENT =================

    public static void studentManagement() {

        boolean back = false;

        while (!back) {

            System.out.println();
            System.out.println("--------- STUDENT MANAGEMENT ---------");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Back");

            int choice = readInteger("Enter your choice: ");

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    studentManager.displayAllStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    deleteStudent();
                    break;

                case 5:
                    back = true;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void addStudent() {

        int id = readInteger("Enter Student ID: ");

        scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Branch: ");
        String branch = scanner.nextLine();

        int semester = readInteger("Enter Semester: ");

        if (!InputValidator.isValidStudentId(id)) {

            System.out.println("Student ID must be positive.");
            return;
        }

        if (!InputValidator.isValidName(name)) {

            System.out.println("Name cannot be empty.");
            return;
        }

        Student student =
                new Student(id, name, branch, semester);

        studentManager.addStudent(student);
    }

    public static void searchStudent() {

        int id = readInteger("Enter Student ID to search: ");

        Student student =
                studentManager.searchStudent(id);

        if (student != null) {

            System.out.println();
            System.out.println("Student found:");
            student.displayInfo();

        } else {

            System.out.println("Student not found.");
        }
    }

    public static void deleteStudent() {

        int id = readInteger("Enter Student ID to delete: ");

        studentManager.deleteStudent(id);
    }

    // ================= ACADEMIC PERFORMANCE =================

    public static void academicPerformance() {

        boolean back = false;

        while (!back) {

            System.out.println();
            System.out.println("------ ACADEMIC PERFORMANCE ------");
            System.out.println("1. Add Subject Marks");
            System.out.println("2. View Subject Marks");
            System.out.println("3. Calculate Performance");
            System.out.println("4. Back");

            int choice = readInteger("Enter your choice: ");

            switch (choice) {

                case 1:
                    addSubject();
                    break;

                case 2:
                    displaySubjects();
                    break;

                case 3:
                    PerformanceAnalyzer.displayAnalysis(subjects);
                    break;

                case 4:
                    back = true;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void addSubject() {

        scanner.nextLine();

        System.out.print("Enter Subject Name: ");
        String name = scanner.nextLine();

        double marks = readDouble("Enter Marks (0-100): ");

        if (!InputValidator.isValidMarks(marks)) {

            System.out.println(
                    "Invalid marks. Marks must be between 0 and 100."
            );

            return;
        }

        Subject subject =
                new Subject(name, marks);

        subjects.add(subject);

        FileManager.saveSubject(subject);

        System.out.println("Subject added successfully.");
    }

    public static void displaySubjects() {

        if (subjects.isEmpty()) {

            System.out.println("No subjects available.");
            return;
        }

        System.out.println();
        System.out.println("--------- SUBJECT MARKS ---------");

        for (Subject subject : subjects) {

            subject.displaySubject();
        }
    }

    // ================= STUDY PLANNER =================

    public static void studyPlannerMenu() {

        boolean back = false;

        while (!back) {

            System.out.println();
            System.out.println("---------- STUDY PLANNER ----------");
            System.out.println("1. Add Study Task");
            System.out.println("2. View Study Tasks");
            System.out.println("3. Mark Task Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Back");

            int choice = readInteger("Enter your choice: ");

            switch (choice) {

                case 1:
                    addStudyTask();
                    break;

                case 2:
                    studyPlanner.displayTasks();
                    break;

                case 3:
                    completeTask();
                    break;

                case 4:
                    deleteTask();
                    break;

                case 5:
                    back = true;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void addStudyTask() {

        int id = readInteger("Enter Task ID: ");

        scanner.nextLine();

        System.out.print("Enter Subject: ");
        String subject = scanner.nextLine();

        System.out.print("Enter Task Description: ");
        String description = scanner.nextLine();

        System.out.print("Enter Priority (LOW/MEDIUM/HIGH): ");
        String priority = scanner.nextLine();

        if (!InputValidator.isValidPriority(priority)) {

            System.out.println(
                    "Priority must be LOW, MEDIUM or HIGH."
            );

            return;
        }

        StudyTask task =
                new StudyTask(
                        id,
                        subject,
                        description,
                        priority.toUpperCase()
                );

        studyPlanner.addTask(task);

        FileManager.saveTask(task);
    }

    public static void completeTask() {

        int id = readInteger("Enter Task ID: ");

        studyPlanner.completeTask(id);
    }

    public static void deleteTask() {

        int id = readInteger("Enter Task ID: ");

        studyPlanner.deleteTask(id);
    }

    // ================= REPORT =================

    public static void generateReport() {

        if (studentManager.getStudentCount() == 0) {

            System.out.println(
                    "Please add a student before generating a report."
            );

            return;
        }

        int id = readInteger("Enter Student ID: ");

        Student student =
                studentManager.searchStudent(id);

        if (student == null) {

            System.out.println("Student not found.");
            return;
        }

        ReportGenerator.generateReport(
                student,
                subjects,
                studyPlanner
        );
    }

    // ================= INPUT HANDLING =================

    public static int readInteger(String message) {

        while (true) {

            try {

                System.out.print(message);

                return scanner.nextInt();

            } catch (Exception e) {

                System.out.println(
                        "Invalid input. Please enter a number."
                );

                scanner.nextLine();
            }
        }
    }

    public static double readDouble(String message) {

        while (true) {

            try {

                System.out.print(message);

                return scanner.nextDouble();

            } catch (Exception e) {

                System.out.println(
                        "Invalid input. Please enter a number."
                );

                scanner.nextLine();
            }
        }
    }
}
