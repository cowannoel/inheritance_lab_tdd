import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void setUp(){
        developer = new Developer("Jonny Knoxville", "NX 60 60 60 Z", 1000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Jonny Knoxville", developer.getName());
    }

    @Test
    public void hasNationalInsuranceNumber(){
        assertEquals("NX 60 60 60 Z", developer.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(1000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1000.00);
        assertEquals(2000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(10.00, developer.canPayBonus(), 0.01);
    }

}
