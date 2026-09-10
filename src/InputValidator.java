public class InputValidator {

    // Validate marks
    public static boolean isValidMarks(double marks) {

        return marks >= 0 && marks <= 100;
    }

    // Validate student ID
    public static boolean isValidStudentId(int studentId) {

        return studentId > 0;
    }

    // Validate name
    public static boolean isValidName(String name) {

        return name != null && !name.trim().isEmpty();
    }

    // Validate menu choice
    public static boolean isValidMenuChoice(int choice, int maximum) {

        return choice >= 1 && choice <= maximum;
    }

    // Validate priority
    public static boolean isValidPriority(String priority) {

        return priority.equalsIgnoreCase("LOW")
                || priority.equalsIgnoreCase("MEDIUM")
                || priority.equalsIgnoreCase("HIGH");
    }
}
