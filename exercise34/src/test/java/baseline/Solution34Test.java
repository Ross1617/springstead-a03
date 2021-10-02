package baseline;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {
    @Test
    public void test_isAnagram(){
        Solution34 sol = new Solution34();
        ArrayList<String> names = new ArrayList<String>();
        names.add("John Smith");
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");
        ArrayList<String> expectedNames = new ArrayList<String>();
        expectedNames.add("John Smith");
        expectedNames.add("Jackie Jackson");
        expectedNames.add("Chris Jones");
        expectedNames.add("Amanda Cullen");
        expectedNames = sol.arrayListDelete(names,"Jeremy Goodwin");
        assertEquals(names, expectedNames);
    }

}