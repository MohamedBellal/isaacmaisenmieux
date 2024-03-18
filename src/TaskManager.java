import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {

    private List<Task> taskList;

    public TaskManager() {
        taskList = new ArrayList<>();
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public void removeTask(Task task) {
        taskList.remove(task);
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void returnTaskList(TaskManager manager) {
        for (Task task : manager.getTaskList()) {
            System.out.println(task);
        }
    }

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the task manager!");
        System.out.println("Let's add your first task together.");
        System.out.println("What's the name of the task you want to add?");
        String taskName = scanner.nextLine();
        System.out.println("What's the size (in Go) of this task?");
        int taskSize = scanner.nextInt();
        System.out.println("What's the CPU usage of this task?");
        double taskCpuUsage = scanner.nextDouble();
        System.out.println("What's the GPU usage of this task?");
        double taskGpuUsage = scanner.nextDouble();
        System.out.println("What's the RAM usage of this task?");
        double taskRamUsage = scanner.nextDouble();

        manager.addTask(new Task(taskName, taskSize, taskCpuUsage, taskGpuUsage, taskRamUsage));

        manager.returnTaskList(manager);

        System.out.println("\nTask List after deletion:");
        for (Task task : manager.getTaskList()) {
            System.out.println(task);
        }
    }
}