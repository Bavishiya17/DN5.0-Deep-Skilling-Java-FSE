package com.cognizant.mockito;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Ex7HandlingVoidMethodsWithExceptionsTest {

    @Test
    public void testVoidMethodThrowsException() {
        FileService mockFileService = mock(FileService.class);

        doThrow(new RuntimeException("File not found"))
            .when(mockFileService).deleteFile("missing.txt");

        FileManager manager = new FileManager(mockFileService);

        RuntimeException ex = assertThrows(RuntimeException.class, () -> {
            manager.removeFile("missing.txt");
        });

        assertEquals("File not found", ex.getMessage());
        verify(mockFileService).deleteFile("missing.txt");
        System.out.println("Ex7 PASSED: Exception thrown correctly on void method.");
    }
}
