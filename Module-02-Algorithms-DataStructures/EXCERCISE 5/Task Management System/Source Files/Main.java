public class Main {

    public static void main(String[] args) {

        TaskLinkedList list = new TaskLinkedList();

        list.addTask(new Task(1, "Design", "Pending"));
        list.addTask(new Task(2, "Coding", "InProgress"));
        list.addTask(new Task(3, "Testing", "Completed"));

        System.out.println("\nTask List");
        list.traverseTasks();

        System.out.println("\nSearch Task");
        list.searchTask(2);

        System.out.println("\nDelete Task");
        list.deleteTask(2);

        System.out.println("\nTask List After Deletion");
        list.traverseTasks();
    }
}