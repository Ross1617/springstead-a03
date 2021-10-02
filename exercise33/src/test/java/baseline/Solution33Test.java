package baseline;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {
    @Test
    public void test_magic8(){
        Solution33 sol = new Solution33();
        String case1 = "Yes";
        String case2 = "No";
        String case3 = "Maybe";
        String case4 = "Ask again later";
        String value1 = sol.magic8(0);
        String value2 = sol.magic8(1);
        String value3 = sol.magic8(2);
        String value4 = sol.magic8(3);
        assertEquals(case1, value1);
        assertEquals(case2,value2);
        assertEquals(case3,value3);
        assertEquals(case4, value4);
    }
}