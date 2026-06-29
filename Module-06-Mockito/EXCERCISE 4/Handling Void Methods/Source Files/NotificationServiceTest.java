import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class NotificationServiceTest {

    @Test
    public void testVoidMethodDoNothing() {
        EmailSender mockSender = Mockito.mock(EmailSender.class);

        // doNothing is default for void methods, but explicit for clarity
        doNothing().when(mockSender).send(anyString(), anyString());

        NotificationService service = new NotificationService(mockSender);
        service.notifyUser("user@example.com", "Hello!");

        // Verify void method was called with specific args
        verify(mockSender).send("user@example.com", "Hello!");
    }
}
