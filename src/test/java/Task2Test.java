import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Task2Test {

    @Test
    public void testSumEvenNumbers() {
        int[] values = {2, 3, 4, 6};
        assertEquals(12, BuggyProgram.sumEvenNumbers(values));
    }

    @Test
    public void testOddNumbers() {
        int[] values2 = {1, 3, 5};
        assertEquals(0, BuggyProgram.sumEvenNumbers(values2));
    }

    @Test
    public void testEmpty() {
        int[] values = {};
        assertEquals(0, BuggyProgram.sumEvenNumbers(values));
    }
}