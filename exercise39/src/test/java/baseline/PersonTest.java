package baseline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    public void test_Person(){
        Solution39 sol = new Solution39();
        Person employee = new Person("Ross","Springstead","Coder","2018-12-21");
        String firstname = employee.getFirstName();
        String lastname = employee.getLastName();
        String department = employee.getDepartment();
        String departure = employee.getSeparationDate();
        String actualFN = "Ross";
        String actualLN = "Springstead";
        String actualDEP = "Coder";
        String actualDepart = "2018-12-21";
        assertEquals(firstname,actualFN);
        assertEquals(lastname,actualLN);
        assertEquals(department,actualDEP);
        assertEquals(departure,actualDepart);
    }


}