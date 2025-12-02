import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testSum() {
        assertEquals(5, Main.sum(2, 3));
    }
}