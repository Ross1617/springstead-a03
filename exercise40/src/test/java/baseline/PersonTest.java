package baseline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    public void test_Person(){
        Solution40 sol = new Solution40();
        Person person1 = new Person("Jacquelyn", "Jackson", "DBA");
        Person person2 = new Person("Swag", "Hope", "TBD");
        String searchWord = "wag";
        String expected1 = "";
        String expected2 = "Hope";
        assertEquals(expected1, person1.findName(searchWord));
        assertEquals(expected2,person2.findName(searchWord));

    }

}