package baseline;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test {
    @Test
    public  void  test_AllFunctions(){
        Solution36 sol = new Solution36();
        ArrayList<Double> numbers = new ArrayList<Double>();
        numbers.add(100.00);
        numbers.add(200.00);
        numbers.add(1000.00);
        numbers.add(300.00);
        double expectedAverage = 400.0;
        double expectedMin = 100;
        double expectedMax = 1000;
        double expectedSTD = 353.55;
        assertEquals(expectedAverage, sol.average(numbers,4));
        assertEquals(expectedMin, sol.min(numbers,4));
        assertEquals(expectedMax,sol.max(numbers,4));
        assertEquals(expectedSTD, sol.std(numbers,4),.01);



    }


}