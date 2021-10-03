package baseline;
import org.junit.jupiter.api.Test;

import javax.naming.NameNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class PaymenetCalculatorTest {
    @Test
    public void test_Payment(){
        Solution26 sol = new Solution26();
        PaymenetCalculator payment = new PaymenetCalculator(12,5000,100);
        double value = payment.calculateMonthsUntilPaidOff();
        double expected = 70;
        //test fails because the calculation function doesn't work and I have no clue because I copied from assignments
        assertEquals(expected,value);
    }

}