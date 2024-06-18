import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private List<Task> tasks;
    private int nextId;

    public TaskManager() {
        tasks = new ArrayList<>();
        nextId = 1;
    }

    public void addTask(String title, String description, LocalDate dueDate) {
        Task task = new Task(nextId++, title, description, dueDate);
        tasks.add(task);
    }

    public Task findTaskById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        throw new IllegalArgumentException("Task not found with id: " + id);
    }

    public void updateTask(int id, String title, String description, LocalDate dueDate) {
        Task task = findTaskById(id);
        task.setTitle(title);
        task.setDescription(description);
        task.setDueDate(dueDate);
    }

    public void deleteTask(int id) {
        Task task = findTaskById(id);
        tasks.remove(task);
    }

    public void markTaskAsCompleted(int id) {
        Task task = findTaskById(id);
        task.setCompleted(true);
    }

    public List<Task> listAllTasks() {
        return new ArrayList<>(tasks);
    }

    public List<Task> listOverdueTasks() {
        List<Task> overdueTasks = new ArrayList<>();
        LocalDate today = LocalDate.now();
        for (Task task : tasks) {
            if (task.getDueDate().isBefore(today) && !task.isCompleted()) {
                overdueTasks.add(task);
            }
        }
        return overdueTasks;
    }
}
