package com.cognizant.mockito;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Ex3ArgumentMatchingTest {

    @Test
    public void testArgumentMatching() {
        UserRepository mockRepo = mock(UserRepository.class);
        when(mockRepo.findById(anyInt())).thenReturn("John Doe");

        UserService service = new UserService(mockRepo);
        String result = service.getUserById(42);

        assertEquals("John Doe", result);
        verify(mockRepo).findById(eq(42));
        System.out.println("Ex3 PASSED: findById(42) matched -> " + result);
    }

    @Test
    public void testSaveWithAnyString() {
        UserRepository mockRepo = mock(UserRepository.class);
        mockRepo.save("Alice");
        verify(mockRepo).save(anyString());
        System.out.println("Ex3 PASSED: save() called with anyString()");
    }
}
