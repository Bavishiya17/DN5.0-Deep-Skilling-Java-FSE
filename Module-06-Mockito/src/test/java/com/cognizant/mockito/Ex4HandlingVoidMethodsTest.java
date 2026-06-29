package com.cognizant.mockito;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class Ex4HandlingVoidMethodsTest {

    @Test
    public void testVoidMethodDoNothing() {
        EmailSender mockSender = mock(EmailSender.class);
        doNothing().when(mockSender).send(anyString(), anyString());

        NotificationService service = new NotificationService(mockSender);
        service.notifyUser("user@example.com", "Hello!");

        verify(mockSender).send("user@example.com", "Hello!");
        System.out.println("Ex4 PASSED: send() void method verified.");
    }
}
