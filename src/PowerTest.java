import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PowerTest {

    @Test
    public void testPower_case1() {
        int n1 = 4;
        int m1 = 3;
        long expected1 = 64;
        long actual1 = Power.power(n1, m1);
        assertEquals(expected1, actual1);
    }

    @Test
    public void testPower_case2() {
        int n2 = 5;
        int m2 = 0;
        long expected2 = 1;
        long actual2 = Power.power(n2, m2);
        assertEquals(expected2, actual2);
    }

    @Test
    public void testPower_case3() {
        int n3 = 10;
        int m3 = 10;
        long expected3 = 10000000000L;
        long actual3 = Power.power(n3, m3);
        assertEquals(expected3, actual3);
    }
}
