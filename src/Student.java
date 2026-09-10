public class Student extends Person {

    private int studentId;
    private String branch;
    private int semester;

    // Constructor
    public Student(int studentId, String name, String branch, int semester) {
        super(name);
        this.studentId = studentId;
        this.branch = branch;
        this.semester = semester;
    }

    // Getter methods
    public int getStudentId() {
        return studentId;
    }

    public String getBranch() {
        return branch;
    }

    public int getSemester() {
        return semester;
    }

    // Setter methods
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    // Method overriding
    @Override
    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + getName());
        System.out.println("Branch: " + branch);
        System.out.println("Semester: " + semester);
    }
}
