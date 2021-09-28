import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class incrementTest {
 
    @Test
    public void testIncrList() {
        IntList L1 = IntList.list(1, 2, 3);
        IntList L2 = IntList.list(2, 3, 4);
        assertEquals("~~~~~~INCRLIST FAILED",
                     L2,
                     increment.incrList(L1, 1));
    }
}