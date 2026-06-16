import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PaymentContext context = new PaymentContext();

        System.out.println("Enter amount:");
        int amount = sc.nextInt();

        System.out.println("Choose payment method: 1.CreditCard 2.PayPal");
        int choice = sc.nextInt();

        if (choice == 1) {
            context.setPaymentStrategy(new CreditCardPayment());
        } else {
            context.setPaymentStrategy(new PayPalPayment());
        }

        context.executePayment(amount);

        sc.close();
    }
}