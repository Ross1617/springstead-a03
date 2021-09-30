package baseline;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {
    @Test
    public void test_passwordValidator(){
        Solution25 sol = new Solution25();
        String password1 = "12345";
        String password2 = "abcdef";
        String password3 = "abc123xyz";
        String password4 = "1337h@xor";
        String password5 = "LongPasswordWithUnknownStrength";
        int valueTest1 = sol.passwordValidator(password1);
        int valueTest2 = sol.passwordValidator(password2);
        int valueTest3 = sol.passwordValidator(password3);
        int valueTest4 = sol.passwordValidator(password4);
        int valueTest5 = sol.passwordValidator(password5);
        assertEquals(valueTest1, 1);
        assertEquals(valueTest2, 2);
        assertEquals(valueTest3, 3);
        assertEquals(valueTest4, 4);
        assertEquals(valueTest5, 5);
    }

}