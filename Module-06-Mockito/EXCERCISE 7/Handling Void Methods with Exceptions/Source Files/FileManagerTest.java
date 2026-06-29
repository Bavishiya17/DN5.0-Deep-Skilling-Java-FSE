import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class FileManagerTest {

    @Test
    public void testVoidMethodThrowsException() {
        FileService mockFileService = Mockito.mock(FileService.class);

        // Stub void method to throw exception
        doThrow(new RuntimeException("File not found"))
            .when(mockFileService).deleteFile("missing.txt");

        FileManager manager = new FileManager(mockFileService);

        // Assert exception is thrown
        RuntimeException ex = assertThrows(RuntimeException.class, () -> {
            manager.removeFile("missing.txt");
        });

        assertEquals("File not found", ex.getMessage());
        verify(mockFileService).deleteFile("missing.txt");
    }
}
