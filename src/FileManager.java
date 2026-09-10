import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {

    private static final String STUDENT_FILE = "students.txt";
    private static final String SUBJECT_FILE = "subjects.txt";
    private static final String TASK_FILE = "tasks.txt";

    // Save student information
    public static void saveStudent(Student student) {

        try {

            FileWriter writer = new FileWriter(STUDENT_FILE, true);

            writer.write(
                student.getStudentId() + "|" +
                student.getName() + "|" +
                student.getBranch() + "|" +
                student.getSemester() + "\n"
            );

            writer.close();

            System.out.println("Student data saved successfully.");

        } catch (IOException e) {

            System.out.println("Error while saving student data.");
        }
    }

    // Display saved students
    public static void displayStudents() {

        try {

            File file = new File(STUDENT_FILE);

            if (!file.exists()) {

                System.out.println("No student data found.");
                return;
            }

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {

                System.out.println(scanner.nextLine());
            }

            scanner.close();

        } catch (IOException e) {

            System.out.println("Error while reading student data.");
        }
    }

    // Save subject information
    public static void saveSubject(Subject subject) {

        try {

            FileWriter writer = new FileWriter(SUBJECT_FILE, true);

            writer.write(
                subject.getSubjectName() + "|" +
                subject.getMarks() + "\n"
            );

            writer.close();

            System.out.println("Subject data saved successfully.");

        } catch (IOException e) {

            System.out.println("Error while saving subject data.");
        }
    }

    // Display saved subjects
    public static void displaySubjects() {

        try {

            File file = new File(SUBJECT_FILE);

            if (!file.exists()) {

                System.out.println("No subject data found.");
                return;
            }

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {

                System.out.println(scanner.nextLine());
            }

            scanner.close();

        } catch (IOException e) {

            System.out.println("Error while reading subject data.");
        }
    }

    // Save study task
    public static void saveTask(StudyTask task) {

        try {

            FileWriter writer = new FileWriter(TASK_FILE, true);

            writer.write(
                task.getTaskId() + "|" +
                task.getSubject() + "|" +
                task.getDescription() + "|" +
                task.getPriority() + "|" +
                task.isCompleted() + "\n"
            );

            writer.close();

            System.out.println("Study task saved successfully.");

        } catch (IOException e) {

            System.out.println("Error while saving study task.");
        }
    }

    // Display saved study tasks
    public static void displayTasks() {

        try {

            File file = new File(TASK_FILE);

            if (!file.exists()) {

                System.out.println("No study task data found.");
                return;
            }

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {

                System.out.println(scanner.nextLine());
            }

            scanner.close();

        } catch (IOException e) {

            System.out.println("Error while reading study tasks.");
        }
    }
}
