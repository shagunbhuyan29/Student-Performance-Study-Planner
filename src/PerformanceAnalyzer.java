import java.util.ArrayList;

public class PerformanceAnalyzer {

    // Calculate total marks
    public static double calculateTotal(ArrayList<Subject> subjects) {

        double total = 0;

        for (Subject subject : subjects) {
            total += subject.getMarks();
        }

        return total;
    }

    // Calculate percentage
    public static double calculatePercentage(ArrayList<Subject> subjects) {

        if (subjects.isEmpty()) {
            return 0;
        }

        double total = calculateTotal(subjects);

        return total / subjects.size();
    }

    // Find highest scoring subject
    public static Subject getBestSubject(ArrayList<Subject> subjects) {

        if (subjects.isEmpty()) {
            return null;
        }

        Subject best = subjects.get(0);

        for (Subject subject : subjects) {

            if (subject.getMarks() > best.getMarks()) {
                best = subject;
            }
        }

        return best;
    }

    // Find lowest scoring subject
    public static Subject getWeakSubject(ArrayList<Subject> subjects) {

        if (subjects.isEmpty()) {
            return null;
        }

        Subject weak = subjects.get(0);

        for (Subject subject : subjects) {

            if (subject.getMarks() < weak.getMarks()) {
                weak = subject;
            }
        }

        return weak;
    }

    // Calculate overall grade
    public static String getOverallGrade(double percentage) {

        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Performance category
    public static String getPerformanceLevel(double percentage) {

        if (percentage >= 90) {
            return "EXCELLENT";
        } else if (percentage >= 75) {
            return "VERY GOOD";
        } else if (percentage >= 60) {
            return "GOOD";
        } else if (percentage >= 40) {
            return "NEEDS IMPROVEMENT";
        } else {
            return "POOR";
        }
    }

    // Generate recommendation
    public static String getRecommendation(double percentage) {

        if (percentage >= 90) {
            return "Excellent performance. Maintain your current study strategy.";
        } else if (percentage >= 75) {
            return "Very good performance. Focus on improving your weaker subjects.";
        } else if (percentage >= 60) {
            return "Good performance. Increase revision and regular practice.";
        } else if (percentage >= 40) {
            return "You need more practice and consistent study time.";
        } else {
            return "Significant improvement is required. Create a regular study schedule.";
        }
    }

    // Display complete analysis
    public static void displayAnalysis(ArrayList<Subject> subjects) {

        if (subjects.isEmpty()) {
            System.out.println("No subject marks available.");
            return;
        }

        double total = calculateTotal(subjects);
        double percentage = calculatePercentage(subjects);

        Subject best = getBestSubject(subjects);
        Subject weak = getWeakSubject(subjects);

        System.out.println("\n========== PERFORMANCE ANALYSIS ==========");
        System.out.println("Total Marks      : " + total);
        System.out.println("Percentage       : " + percentage + "%");
        System.out.println("Overall Grade    : " + getOverallGrade(percentage));
        System.out.println("Performance Level: " + getPerformanceLevel(percentage));

        System.out.println("Best Subject     : "
                + best.getSubjectName() + " (" + best.getMarks() + ")");

        System.out.println("Focus Subject    : "
                + weak.getSubjectName() + " (" + weak.getMarks() + ")");

        System.out.println("\nRecommendation:");
        System.out.println(getRecommendation(percentage));

        System.out.println("==========================================");
    }
}
