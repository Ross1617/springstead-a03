package baseline;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class Solution28Test {
    @Test
    public void test_counter(){
        Solution28 sol = new Solution28();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(20);
        numbers.add(20);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        int value = sol.counter(numbers);
        int expected = 110;
        assertEquals(value,expected);


    }

}