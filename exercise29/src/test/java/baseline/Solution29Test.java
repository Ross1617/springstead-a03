package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {
    @Test
    public  void  test_Calculate(){
        Solution29 sol = new Solution29();
        double expected = 18;
        double actual = sol.calculate(4);
        assertEquals(expected, actual);
    }

}