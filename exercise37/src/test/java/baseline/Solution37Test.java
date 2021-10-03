package baseline;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution37Test {
    @Test
    public void test_Password(){
        Solution37 sol = new Solution37();
        String password = sol.passwordCreator(10,3,3);
        int expectedSize = 16;
        int size = password.length();
        assertEquals(size, expectedSize);
    }

}