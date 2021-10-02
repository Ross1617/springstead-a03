package baseline;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {
    @Test
    public void test_winnerPick(){
        Solution35 sol = new Solution35();
        String expectedWinner = "Pablo";
        ArrayList<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Mark");
        names.add("Pablo");
        names.add("Luke");
        String winner = sol.winnerPick(names, 2);
        assertEquals(expectedWinner,winner);

    }

}