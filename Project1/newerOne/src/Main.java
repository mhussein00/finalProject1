import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static ArrayList<String> listOfTasks = new ArrayList<>();


    public static int promptUser(Scanner input) {
        System.out.println("Please select one.\n");
        System.out.println("(1) Add a task.");
        System.out.println("(2) Remove a task.");
        System.out.println("(3) Update a task.");
        System.out.println("(4) List all tasks.");
        System.out.println("(0) Exit.");
        System.out.println("Which task would you like to do?");
        int task = input.nextInt();
        input.nextLine();

        return task;
    }

    public static String addTask(Scanner input) {
        System.out.println("Please describe the task.");
        String newTask = input.nextLine();
        listOfTasks.add(newTask);
        return newTask;
    }

    public static void removeTask(Scanner input) {
        System.out.println("What task would use like to remove? 0-" + listOfTasks.size());
        int task = input.nextInt();
        input.nextLine();
        listOfTasks.remove(task);
        System.out.println(listOfTasks);


    }

    public static void updateTask(Scanner input) {
        System.out.println(listOfTasks);
        System.out.println("What task would use like to update? 0-" + listOfTasks.size());
        int updatedList = input.nextInt();
        System.out.println("Please add a description:");
        String descriptionTask = input.nextLine();
        descriptionTask = input.nextLine();

        listOfTasks.set(updatedList, descriptionTask);
    }

    public static ArrayList returnList() {
        for (int i = 0; i < listOfTasks.size(); i++) {
            System.out.printf(i + ": " + listOfTasks.get(i) + "\n");
        }

        return listOfTasks;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int task = promptUser(input);
        while (true) {
            switch (task) {
                case 1:
                    addTask(input);
                    task = promptUser(input);
                    break;
                case 2:
                    removeTask(input);
                    task = promptUser(input);
                    break;
                case 3:
                    updateTask(input);
                    task = promptUser(input);
                    break;
                case 4:
                    returnList();
                    task = promptUser(input);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please select a valid number");
                    promptUser(input);
                    break;


            }

        }
    }
}
