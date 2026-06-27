public class Main {

    public static void main(String[] args) {

        Order[] orders1 = {
                new Order(101, "Rahul", 3500),
                new Order(102, "Anu", 1200),
                new Order(103, "Vijay", 5600),
                new Order(104, "Priya", 2200)
        };

        System.out.println("Bubble Sort");

        SortOperation.bubbleSort(orders1);
        SortOperation.display(orders1);

        Order[] orders2 = {
                new Order(101, "Rahul", 3500),
                new Order(102, "Anu", 1200),
                new Order(103, "Vijay", 5600),
                new Order(104, "Priya", 2200)
        };

        System.out.println("\nQuick Sort");

        SortOperation.quickSort(orders2, 0, orders2.length - 1);
        SortOperation.display(orders2);
    }
}