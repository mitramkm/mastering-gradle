package ch4.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import ch4.Customer;


public class CustomerTest {
	
	@Test
	public void verifyCustomerName(){
		Customer c1 = new Customer("Cust1");
		Assert.assertEquals("CUST1", c1.getName().toUpperCase());
	}

}
