public class Subject {

    private String subjectName;
    private double marks;

    // Constructor
    public Subject(String subjectName, double marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    // Getter methods
    public String getSubjectName() {
        return subjectName;
    }

    public double getMarks() {
        return marks;
    }

    // Setter for marks
    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Calculate grade
    public String getGrade() {

        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Display subject information
    public void displaySubject() {
        System.out.println(
            subjectName + " : " + marks + " marks - Grade " + getGrade()
        );
    }
}
