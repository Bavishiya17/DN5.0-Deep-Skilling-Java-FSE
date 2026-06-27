import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Keyboard", "Electronics"),
                new Product(104, "Shoes", "Fashion"),
                new Product(105, "Watch", "Accessories")
        };

        System.out.print("Enter Product ID to Search: ");
        int id = sc.nextInt();

        System.out.println("\nLinear Search Result");

        Product p1 = SearchOperation.linearSearch(products, id);

        if (p1 != null)
            p1.display();
        else
            System.out.println("Product Not Found");

        System.out.println("\nBinary Search Result");

        Product p2 = SearchOperation.binarySearch(products, id);

        if (p2 != null)
            p2.display();
        else
            System.out.println("Product Not Found");

        sc.close();
    }
}