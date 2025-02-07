import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Task 
{
    String task;
    boolean isDone;

    public Task(String task) 
    {
        this.task = task;
        this.isDone = false;
    }
}

public class prac7_1 
{
    static Scanner sc = new Scanner(System.in);
    static List<Task> tasks = new ArrayList<>();

    public static void main(String[] args) 
    {
        while (true) 
        {
            printMenu();
            int choice = getChoice();
            todoList(choice);
        }
    }

    private static int getChoice() 
    {
        System.out.print("Choose an option: ");
        return sc.nextInt();
    }

    private static void printMenu() 
    {
        System.out.println("\nTo-Do List Menu:");
        System.out.println("1. Add Task");
        System.out.println("2. Display Tasks");
        System.out.println("3. Edit Task");
        System.out.println("4. Delete Task");
        System.out.println("5. Exit");
    }

    private static void todoList(int choice) 
    {
        switch (choice) 
        {
            case 1 -> addTask();
            case 2 -> displayTasks();
            case 3 -> editTask();
            case 4 -> deleteTask();
            case 5 -> System.exit(0);
            default -> System.out.println("Invalid option. Please choose again.");
        }
    }

    private static void addTask() 
    {
        System.out.print("Enter task name: ");
        sc.nextLine();
        tasks.add(new Task(sc.nextLine()));
        System.out.println("Task added successfully!");
    }

    private static void displayTasks() 
    {
        if (tasks.isEmpty()) 
        {
            System.out.println("No task available.");
            return;
        }
        System.out.println("\nYour Tasks: ");
        for (int i = 0; i < tasks.size(); i++) 
        {
            Task task = tasks.get(i);
            System.out.println((i + 1) + ". " + task.task + " [" + (task.isDone ? "Completed" : "NotCompleted") + "]");
        }
    }

    private static void editTask() 
    {
        displayTasks();
        System.out.print("Enter Task number to edit: ");
        int n = sc.nextInt();
        sc.nextLine();
        if (n < 1 || n > tasks.size()) 
        {
            System.out.println("Enter Valid Number.");
            return;
        }
        System.out.print("Enter new Task Name: ");
        tasks.get(n - 1).task = sc.nextLine();
        System.out.println("Task updated successfully!");
    }

    private static void deleteTask() 
    {
        displayTasks();
        System.out.print("Enter Task number to delete: ");
        int n = sc.nextInt();
        sc.nextLine();
        if (n < 1 || n > tasks.size()) 
        {
            System.out.println("Enter Valid Number.");
            return;
        }
        tasks.remove(n - 1);
        System.out.println("Task deleted successfully!");
    }
}
