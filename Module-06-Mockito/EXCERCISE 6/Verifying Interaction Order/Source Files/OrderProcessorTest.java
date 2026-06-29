import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

public class OrderProcessorTest {

    @Test
    public void testInteractionOrder() {
        InventoryService mockInventory = Mockito.mock(InventoryService.class);
        PaymentService mockPayment = Mockito.mock(PaymentService.class);

        OrderProcessor processor = new OrderProcessor(mockInventory, mockPayment);
        processor.processOrder("Laptop", 999.99);

        // Verify methods were called in the correct order
        InOrder inOrder = inOrder(mockInventory, mockPayment);
        inOrder.verify(mockInventory).reserve("Laptop");
        inOrder.verify(mockPayment).charge(999.99);
        inOrder.verify(mockInventory).confirm("Laptop");
    }
}
