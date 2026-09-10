public class ProjectTest {

    public static void main(String[] args) {

        System.out.println("===== PROJECT TESTING =====");

        // Test 1: Student creation
        Student student = new Student(
            101,
            "Test Student",
            "AIML",
            3
        );

        if (student.getStudentId() == 101) {
            System.out.println("Test 1: Student creation - PASSED");
        } else {
            System.out.println("Test 1: Student creation - FAILED");
        }

        // Test 2: Subject grade calculation
        Subject subject = new Subject("Java", 82);

        if (subject.getGrade().equals("A")) {
            System.out.println("Test 2: Grade calculation - PASSED");
        } else {
            System.out.println("Test 2: Grade calculation - FAILED");
        }

        // Test 3: Marks validation
        if (InputValidator.isValidMarks(85)) {
            System.out.println("Test 3: Valid marks - PASSED");
        } else {
            System.out.println("Test 3: Valid marks - FAILED");
        }

        // Test 4: Invalid marks
        if (!InputValidator.isValidMarks(105)) {
            System.out.println("Test 4: Invalid marks - PASSED");
        } else {
            System.out.println("Test 4: Invalid marks - FAILED");
        }

        // Test 5: Student ID validation
        if (InputValidator.isValidStudentId(101)) {
            System.out.println("Test 5: Student ID validation - PASSED");
        } else {
            System.out.println("Test 5: Student ID validation - FAILED");
        }

        // Test 6: Study task creation
        StudyTask task = new StudyTask(
            1,
            "Java",
            "Practice OOP concepts",
            "HIGH"
        );

        if (task.getTaskId() == 1 &&
            task.getPriority().equals("HIGH")) {

            System.out.println("Test 6: Study task creation - PASSED");

        } else {

            System.out.println("Test 6: Study task creation - FAILED");
        }

        System.out.println("===========================");
        System.out.println("Testing completed.");
    }
}
