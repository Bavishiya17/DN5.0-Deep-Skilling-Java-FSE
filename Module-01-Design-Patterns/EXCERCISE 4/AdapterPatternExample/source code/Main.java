public class Main {

    public static void main(String[] args) {

        PaymentProcessor p1 = new PayPalAdapter();
        PaymentProcessor p2 = new StripeAdapter();

        p1.processPayment(5000);
        p2.processPayment(2500);

    }

}