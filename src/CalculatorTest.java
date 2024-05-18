import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testMingleStrings_case1() {
        boolean actual = Calculator.validate("*", 3);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}
