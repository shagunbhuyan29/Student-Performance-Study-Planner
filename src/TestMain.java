public class TestMain {

    public static void main(String[] args) {

        Student student = new Student(
            101,
            "Shagun",
            "AIML",
            3
        );

        Subject java = new Subject(
            "Java",
            82
        );

        System.out.println("===== STUDENT DETAILS =====");
        student.displayInfo();

        System.out.println();

        System.out.println("===== SUBJECT DETAILS =====");
        java.displaySubject();
    }
}
