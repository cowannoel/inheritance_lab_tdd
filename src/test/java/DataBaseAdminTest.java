import org.junit.Before;
import org.junit.Test;
import techStaff.DataBaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DataBaseAdminTest {

    private DataBaseAdmin dataBaseAdmin;

    @Before
    public void setUp(){
        dataBaseAdmin = new DataBaseAdmin("Wee Man", "NX 70 70 70 Z", 2000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Wee Man", dataBaseAdmin.getName());
    }

    @Test
    public void hasNationalInsuranceNumber(){
        assertEquals("NX 70 70 70 Z", dataBaseAdmin.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(2000.00, dataBaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        dataBaseAdmin.raiseSalary(1000.00);
        assertEquals(3000.00, dataBaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(20.00, dataBaseAdmin.canPayBonus(), 0.01);
    }
}
