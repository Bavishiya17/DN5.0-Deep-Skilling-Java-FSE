import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Inventory inventory = new Inventory();

        char choice = 'y';

        while (choice == 'y' || choice == 'Y') {

            System.out.print("Enter Product ID : ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Product Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Quantity : ");
            int qty = sc.nextInt();

            System.out.print("Enter Price : ");
            double price = sc.nextDouble();

            inventory.addProduct(new Product(id, name, qty, price));

            System.out.print("Add Another Product (y/n) : ");
            choice = sc.next().charAt(0);
        }

        System.out.println("\nProducts");
        inventory.displayProducts();

        System.out.print("\nEnter Product ID to Update : ");
        int updateId = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter New Name : ");
        String newName = sc.nextLine();

        System.out.print("Enter New Quantity : ");
        int newQty = sc.nextInt();

        System.out.print("Enter New Price : ");
        double newPrice = sc.nextDouble();

        inventory.updateProduct(updateId, newName, newQty, newPrice);

        System.out.println("\nProducts After Update");
        inventory.displayProducts();

        System.out.print("\nEnter Product ID to Delete : ");
        int deleteId = sc.nextInt();

        inventory.deleteProduct(deleteId);

        System.out.println("\nProducts After Delete");
        inventory.displayProducts();

        sc.close();
    }
}