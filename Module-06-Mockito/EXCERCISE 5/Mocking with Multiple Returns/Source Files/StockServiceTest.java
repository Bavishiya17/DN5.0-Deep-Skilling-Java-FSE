import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class StockServiceTest {

    @Test
    public void testMultipleReturnValues() {
        StockApi mockApi = Mockito.mock(StockApi.class);

        // Return different values on consecutive calls
        when(mockApi.fetchPrice("AAPL"))
            .thenReturn(150.0)
            .thenReturn(152.5)
            .thenReturn(149.0);

        StockService service = new StockService(mockApi);

        assertEquals(150.0, service.getPrice("AAPL"));
        assertEquals(152.5, service.getPrice("AAPL"));
        assertEquals(149.0, service.getPrice("AAPL"));
    }
}
