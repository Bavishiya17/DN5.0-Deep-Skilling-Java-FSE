public class TaskLinkedList {

    Task head = null;

    public void addTask(Task task) {

        if (head == null) {
            head = task;
        } else {

            Task temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = task;
        }

        System.out.println("Task Added");
    }

    public void searchTask(int id) {

        Task temp = head;

        while (temp != null) {

            if (temp.taskId == id) {
                temp.display();
                return;
            }

            temp = temp.next;
        }

        System.out.println("Task Not Found");
    }

    public void traverseTasks() {

        Task temp = head;

        while (temp != null) {
            temp.display();
            temp = temp.next;
        }
    }

    public void deleteTask(int id) {

        if (head == null) {
            System.out.println("List Empty");
            return;
        }

        if (head.taskId == id) {
            head = head.next;
            System.out.println("Task Deleted");
            return;
        }

        Task temp = head;

        while (temp.next != null && temp.next.taskId != id) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
            System.out.println("Task Deleted");
        } else {
            System.out.println("Task Not Found");
        }
    }
}