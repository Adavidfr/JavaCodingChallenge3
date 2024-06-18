import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();

        System.out.println("=============Add Task============");
        taskManager.addTask("read a book", "read a book for 1 hour", LocalDate.of(2024, 4, 12));
        taskManager.addTask("cook", "cook ramen", LocalDate.of(2024, 5, 5));
        taskManager.addTask("run", "run for 20 minutes", LocalDate.of(2024, 2, 17));
        taskManager.addTask("send message", "send a message to your friend", LocalDate.of(2024, 5, 22));

        System.out.println("=============List all tasks============");
        for (Task task : taskManager.listAllTasks()) {
            System.out.println(task);
        }

        System.out.println("=============Find task by id============");
        System.out.println(taskManager.findTaskById(2));

        System.out.println("=============Update task============");
        taskManager.updateTask(2, "cook a hamburguer", "cook a hamburguer", LocalDate.of(2024, 5, 16));
        for (Task task : taskManager.listAllTasks()) {
            System.out.println(task);
        }

        System.out.println("=============Delete task============");
        taskManager.deleteTask(3);
        for (Task task : taskManager.listAllTasks()) {
            System.out.println(task);
        }

        System.out.println("=============Mark task as completed============");
        taskManager.markTaskAsCompleted(1);
        taskManager.markTaskAsCompleted(4);
        for (Task task : taskManager.listAllTasks()) {
            System.out.println(task);
        }

        System.out.println("=============List overdue tasks============");
        System.out.println(taskManager.listOverdueTasks());

    }
}