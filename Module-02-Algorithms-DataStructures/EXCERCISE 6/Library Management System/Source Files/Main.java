import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Sorted by title
        Book[] books = {
                new Book(101, "C Programming", "Dennis"),
                new Book(102, "Data Structures", "Mark"),
                new Book(103, "Java", "James"),
                new Book(104, "Python", "Guido"),
                new Book(105, "SQL", "John")
        };

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.println("\nLinear Search");

        Book b1 = SearchBook.linearSearch(books, title);

        if (b1 != null)
            b1.display();
        else
            System.out.println("Book Not Found");

        System.out.println("\nBinary Search");

        Book b2 = SearchBook.binarySearch(books, title);

        if (b2 != null)
            b2.display();
        else
            System.out.println("Book Not Found");

        sc.close();
    }
}