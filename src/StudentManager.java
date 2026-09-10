import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    // Add a new student
    public void addStudent(Student student) {

        if (student == null) {
            System.out.println("Invalid student.");
            return;
        }

        // Check for duplicate student ID
        for (Student s : students) {
            if (s.getStudentId() == student.getStudentId()) {
                System.out.println("Student ID already exists.");
                return;
            }
        }

        students.add(student);
        FileManager.saveStudent(student);

        System.out.println("Student added successfully.");
    }

    // Display all students
    public void displayAllStudents() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("\n===== STUDENT LIST =====");

        for (Student student : students) {
            student.displayInfo();
            System.out.println("--------------------------------");
        }
    }

    // Search student by ID
    public Student searchStudent(int studentId) {

        for (Student student : students) {

            if (student.getStudentId() == studentId) {
                return student;
            }
        }

        return null;
    }

    // Delete student by ID
    public boolean deleteStudent(int studentId) {

        Student student = searchStudent(studentId);

        if (student != null) {
            students.remove(student);
            System.out.println("Student deleted successfully.");
            return true;
        }

        System.out.println("Student not found.");
        return false;
    }

    // Get number of students
    public int getStudentCount() {
        return students.size();
    }
}
