package baseline;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class Solution30Test {
    @Test
    public void test_tableMaker() {
        Solution30 sol = new Solution30();
        int expectedValue = 1;
        int value1 = sol.tableMaker(12,12);
        assertEquals(value1,expectedValue);
    }



}