package ch6.login;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class LoginTest {
	private String userName="Gradle";
	 
	@BeforeClass
    	public static void oneTimeSetUp() {
        	// one-time initialization code   
    		System.out.println("@BeforeClass - oneTimeSetUp");
    	}
 
    	@AfterClass
    	public static void oneTimeTearDown() {
        	// one-time cleanup code
    		System.out.println("@AfterClass - oneTimeTearDown");
    	}
 
	@Test
    	public void testUserName() {
        	System.out.println("LoginTest: Testing Login ");
		assertTrue(userName.equals("Gradle"));
    	}
 
	@Test
    	public void testUserNameNotNull() {
        	System.out.println("LoginTest: Testing Login 2");
		assertTrue(userName != null);
    	}
    
}
