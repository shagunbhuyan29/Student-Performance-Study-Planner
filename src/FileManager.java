import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {

    private static final String STUDENT_FILE = "students.txt";

    // Save student to file
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

    // Display all saved students
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
}
