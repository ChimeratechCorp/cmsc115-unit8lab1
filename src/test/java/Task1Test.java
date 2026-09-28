import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Task1Test {

    @Test
    public void testGrades() {
        assertEquals("Exceeds", BuggyProgram.getGrade(95));
        assertEquals("Meets", BuggyProgram.getGrade(85));
        assertEquals("Does Not Meet", BuggyProgram.getGrade(60));
    }

    @Test
    public void testEdges() {
        assertEquals("Exceeds", BuggyProgram.getGrade(90));
        assertEquals("Meets", BuggyProgram.getGrade(80));
        assertEquals("Does Not Meet", BuggyProgram.getGrade(79));
    }
}