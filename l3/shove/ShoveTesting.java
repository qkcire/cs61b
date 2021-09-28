import org.junit.Test;
import static org.junit.Assert.*;

public class ShoveTesting {
    @Test
    public void shoveTest() {
        int[] test = new int[]{2, 1, 9, 6, 3, -2, 7, 0, 19, -1};
        int[] expect = new int[]{2, 1, 9, 6, 3, -2, -1, 7, 0, 19}; 
        Shove.moveOver(test);
        assertArrayEquals("Shove failed. ", expect, test);
    }
    
    @Test
    public void shoveTest1() {

    }
}
