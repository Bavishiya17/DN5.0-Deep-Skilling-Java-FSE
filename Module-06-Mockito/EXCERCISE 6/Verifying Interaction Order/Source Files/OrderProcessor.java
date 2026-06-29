public class OrderProcessor {
    private InventoryService inventory;
    private PaymentService payment;

    public OrderProcessor(InventoryService inventory, PaymentService payment) {
        this.inventory = inventory;
        this.payment = payment;
    }

    public void processOrder(String item, double amount) {
        inventory.reserve(item);
        payment.charge(amount);
        inventory.confirm(item);
    }
}
