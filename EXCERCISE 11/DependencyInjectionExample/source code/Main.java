import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CustomerRepository repo = new CustomerRepositoryImpl();

        CustomerService service = new CustomerService(repo);

        System.out.println("Enter Customer ID:");
        int id = sc.nextInt();

        service.showCustomer(id);

        sc.close();
    }
}