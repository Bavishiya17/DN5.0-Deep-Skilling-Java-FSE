package com.cognizant.mockito;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class Ex2VerifyingInteractionsTest {

    @Test
    public void testVerifyInteraction() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        MyService service = new MyService(mockApi);
        service.fetchData();

        verify(mockApi).getData();
        System.out.println("Ex2 PASSED: getData() was verified as called.");
    }
}
