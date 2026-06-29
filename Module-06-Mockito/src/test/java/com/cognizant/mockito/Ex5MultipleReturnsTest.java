package com.cognizant.mockito;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Ex5MultipleReturnsTest {

    @Test
    public void testMultipleReturnValues() {
        StockApi mockApi = mock(StockApi.class);
        when(mockApi.fetchPrice("AAPL"))
            .thenReturn(150.0)
            .thenReturn(152.5)
            .thenReturn(149.0);

        StockService service = new StockService(mockApi);

        assertEquals(150.0, service.getPrice("AAPL"));
        assertEquals(152.5, service.getPrice("AAPL"));
        assertEquals(149.0, service.getPrice("AAPL"));
        System.out.println("Ex5 PASSED: Multiple return values 150.0, 152.5, 149.0");
    }
}
