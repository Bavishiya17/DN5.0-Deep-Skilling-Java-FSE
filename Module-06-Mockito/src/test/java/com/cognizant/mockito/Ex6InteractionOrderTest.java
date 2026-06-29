package com.cognizant.mockito;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

public class Ex6InteractionOrderTest {

    @Test
    public void testInteractionOrder() {
        InventoryService mockInventory = mock(InventoryService.class);
        PaymentService mockPayment = mock(PaymentService.class);

        OrderProcessor processor = new OrderProcessor(mockInventory, mockPayment);
        processor.processOrder("Laptop", 999.99);

        InOrder inOrder = inOrder(mockInventory, mockPayment);
        inOrder.verify(mockInventory).reserve("Laptop");
        inOrder.verify(mockPayment).charge(999.99);
        inOrder.verify(mockInventory).confirm("Laptop");
        System.out.println("Ex6 PASSED: reserve -> charge -> confirm order verified.");
    }
}
