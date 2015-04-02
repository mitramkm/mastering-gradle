package ch4;

import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest {	
	
	@Test
    public void canConstructAPersonWithAName() {
        Customer c1 = new Customer("Cust1");
        assertEquals("CUST1", c1.getName().toUpperCase());
    }

}
