import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testSum() {
        assertEquals(333, Main.sum(111, 222));
    }
}