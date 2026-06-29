import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class UserServiceTest {

    @Test
    public void testArgumentMatching() {
        UserRepository mockRepo = Mockito.mock(UserRepository.class);

        // Stub with argument matcher
        when(mockRepo.findById(anyInt())).thenReturn("John Doe");

        UserService service = new UserService(mockRepo);
        String result = service.getUserById(42);

        assertEquals("John Doe", result);

        // Verify with exact argument
        verify(mockRepo).findById(eq(42));
    }

    @Test
    public void testSaveWithAnyString() {
        UserRepository mockRepo = Mockito.mock(UserRepository.class);

        mockRepo.save("Alice");

        verify(mockRepo).save(anyString());
    }
}
