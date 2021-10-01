package baseline;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {
    @Test
    public void test_validateInput(){
        Solution27 sol = new Solution27();
        String firstName1 = "J";
        String lastName1 = " ";
        String zipCode1 = "ABCDE";
        String ID1 = "A12-3213";
        String firstName2 = "John";
        String lastName2 = "Johnson";
        String zipCode2 = "55555";
        String ID2 = "TK-3213";
        int valueTest1 = sol.validateInput(firstName1,lastName1,zipCode1,ID1);
        int valueTest2 = sol.validateInput(firstName2,lastName2,zipCode2,ID2);
        assertEquals(valueTest1,4);
        assertEquals(valueTest2, 0);

    }

}