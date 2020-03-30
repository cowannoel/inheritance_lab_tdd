import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Preston Lacey", "NX 50 50 50 Z", 500.00, "Jackass");
    }

    @Test
    public void hasName(){
        assertEquals("Preston Lacey", manager.getName());
    }

    @Test
    public void HasNationalInsuranceNumber(){
        assertEquals("NX 50 50 50 Z", manager.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(500.00, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Jackass", manager.getDeptName());
    }

    @Test
    public void CanRaiseSalary(){
        manager.raiseSalary(500.00);
        assertEquals(1000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(5.00, manager.canPayBonus(), 0.01);
    }
}
