import java.util.ArrayList;

public class ReportGenerator {

    public static void generateReport(
            Student student,
            ArrayList<Subject> subjects,
            StudyPlanner planner) {

        System.out.println("\n");
        System.out.println("==============================================");
        System.out.println("          STUDENT PERFORMANCE REPORT");
        System.out.println("==============================================");

        System.out.println("Student ID : " + student.getStudentId());
        System.out.println("Name       : " + student.getName());
        System.out.println("Branch     : " + student.getBranch());
        System.out.println("Semester   : " + student.getSemester());

        System.out.println("\n------------- SUBJECT PERFORMANCE ------------");

        if (subjects.isEmpty()) {

            System.out.println("No subject data available.");

        } else {

            for (Subject subject : subjects) {

                System.out.println(
                    subject.getSubjectName()
                    + " : "
                    + subject.getMarks()
                    + " - Grade "
                    + subject.getGrade()
                );
            }

            double total =
                    PerformanceAnalyzer.calculateTotal(subjects);

            double percentage =
                    PerformanceAnalyzer.calculatePercentage(subjects);

            Subject best =
                    PerformanceAnalyzer.getBestSubject(subjects);

            Subject weak =
                    PerformanceAnalyzer.getWeakSubject(subjects);

            System.out.println("----------------------------------------------");
            System.out.println("Total Marks : " + total);
            System.out.println("Percentage  : " + percentage + "%");
            System.out.println("Grade       : "
                    + PerformanceAnalyzer.getOverallGrade(percentage));

            System.out.println("Best Subject: "
                    + best.getSubjectName());

            System.out.println("Focus Subject: "
                    + weak.getSubjectName());

            System.out.println("Performance : "
                    + PerformanceAnalyzer.getPerformanceLevel(percentage));
        }

        System.out.println("\n---------------- STUDY PLAN -----------------");

        System.out.println("Completed Tasks : "
                + planner.getCompletedCount());

        System.out.println("Pending Tasks   : "
                + planner.getPendingCount());

        System.out.println("\n==============================================");
        System.out.println("              END OF REPORT");
        System.out.println("==============================================");
    }
}
