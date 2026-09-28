import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Task3Test {

    @Test
    public void testSumRangeNormalOrder() {
        assertEquals(6, BuggyProgram.sumRange(1, 3));
    }

    @Test
    public void testSumRangeReverseOrder() {
        assertEquals(15, BuggyProgram.sumRange(5, 1));
    }

    @Test
    public void testSumRangeSingleValue() {
        assertEquals(7, BuggyProgram.sumRange(7, 7));
    }

}