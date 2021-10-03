package baseline;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution32Test {
    @Test
    public void test_game(){
        Solution32 sol = new Solution32();
        boolean value = sol.game(1,21);

        assertEquals(value,false);

    }

}