package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {
    //creating test
    @Test
    public void test_isAnagram(){
        Solution24 sol = new Solution24();
        String word1 = "apple";
        String word2 = "notApple";
        String word3 = "elppa";
        boolean valueTest1 = sol.isAnagram(word1,word2);
        boolean valueTest2 = sol.isAnagram(word1,word3);
        //boolean expectedTest1 = false;
        //boolean expectedTest2 = true;

        assertEquals(valueTest1,false);
        assertEquals(valueTest2, true);


    }


}