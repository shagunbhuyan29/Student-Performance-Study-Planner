import java.util.ArrayList;

public class StudyPlanner {

    private ArrayList<StudyTask> tasks;

    public StudyPlanner() {
        tasks = new ArrayList<>();
    }

    // Add task
    public void addTask(StudyTask task) {

        if (task == null) {
            System.out.println("Invalid task.");
            return;
        }

        tasks.add(task);

        System.out.println("Study task added successfully.");
    }

    // Display all tasks
    public void displayTasks() {

        if (tasks.isEmpty()) {
            System.out.println("No study tasks available.");
            return;
        }

        System.out.println("\n========== STUDY TASKS ==========");

        for (StudyTask task : tasks) {
            task.displayTask();
        }
    }

    // Complete a task
    public void completeTask(int taskId) {

        for (StudyTask task : tasks) {

            if (task.getTaskId() == taskId) {

                task.markCompleted();

                System.out.println("Task marked as completed.");
                return;
            }
        }

        System.out.println("Task not found.");
    }

    // Delete task
   public void deleteTask(int taskId) {

    for (int i = 0; i < tasks.size(); i++) {

        if (tasks.get(i).getTaskId() == taskId) {

            tasks.remove(i);

            System.out.println("Task deleted successfully.");
            return;
        }
    }

    System.out.println("Task not found.");
}

    // Count completed tasks
    public int getCompletedCount() {

        int count = 0;

        for (StudyTask task : tasks) {

            if (task.isCompleted()) {
                count++;
            }
        }

        return count;
    }

    // Count pending tasks
    public int getPendingCount() {

        int count = 0;

        for (StudyTask task : tasks) {

            if (!task.isCompleted()) {
                count++;
            }
        }

        return count;
    }
}
