package baseline;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution38Test {
    @Test
    public void test_filterEvenNumbers(){
        Solution38 sol = new Solution38();
        String[] values = {"32","100","43","60","53"};
        Integer[] arrayEven = sol.filterEvenNumbers(values);
        int length = arrayEven.length;

        Integer[] expected = {32,100,60};
        int lengthExpected = expected.length;
        assertEquals(lengthExpected,length);
    }
}