package baseline;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {
    @Test
    public void test_karvonenHeartRate(){
        Solution31 sol = new Solution31();
        double expected = 1;
        double returnValue = sol.karvonenHeartRate(65, 32);
        assertEquals(expected,returnValue,.00001);

    }

}