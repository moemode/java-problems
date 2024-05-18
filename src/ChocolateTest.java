import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChocolateTest {

    @Test
    public void testBreakoffPossible_case1() {
        int N1 = 4;
        int M1 = 2;
        int K1 = 6;
        boolean expected1 = true;
        boolean actual1 = Chocolate.breakoffPossible(N1, M1, K1);
        assertEquals(expected1, actual1);
    }

    @Test
    public void testBreakoffPossible_case2() {
        int N2 = 2;
        int M2 = 10;
        int K2 = 7;
        boolean expected2 = false;
        boolean actual2 = Chocolate.breakoffPossible(N2, M2, K2);
        assertEquals(expected2, actual2);
    }

    @Test
    public void testBreakoffPossible_case3() {
        int N3 = 7;
        int M3 = 4;
        int K3 = 21;
        boolean expected3 = true;
        boolean actual3 = Chocolate.breakoffPossible(N3, M3, K3);
        assertEquals(expected3, actual3);
    }
}
