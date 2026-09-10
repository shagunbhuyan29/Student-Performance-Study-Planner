public class StudyTask {

    private int taskId;
    private String subject;
    private String description;
    private String priority;
    private boolean completed;

    // Constructor
    public StudyTask(int taskId, String subject, String description, String priority) {
        this.taskId = taskId;
        this.subject = subject;
        this.description = description;
        this.priority = priority;
        this.completed = false;
    }

    // Getters
    public int getTaskId() {
        return taskId;
    }

    public String getSubject() {
        return subject;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    // Mark task as completed
    public void markCompleted() {
        completed = true;
    }

    // Display task
    public void displayTask() {

        String status;

        if (completed) {
            status = "COMPLETED";
        } else {
            status = "PENDING";
        }

        System.out.println("Task ID    : " + taskId);
        System.out.println("Subject    : " + subject);
        System.out.println("Task       : " + description);
        System.out.println("Priority   : " + priority);
        System.out.println("Status     : " + status);
        System.out.println("--------------------------------");
    }
}
