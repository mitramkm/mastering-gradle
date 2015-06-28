package ch6.profile;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class ProfileTest {
	private String userProfile = "UserProfile";
	public ProfileTest() {
	}
	 @BeforeClass
    public static void oneTimeSetUp() {
        // one-time initialization code   
    	System.out.println("@BeforeClass - ProfileTest oneTimeSetUp");
    }
 
    @AfterClass
    public static void oneTimeTearDown() {
        // one-time cleanup code
    	System.out.println("@AfterClass - ProfileTest oneTimeTearDown");
    }
 
	
	@Test
    public void testUserProfile1() {
        System.out.println("ProfileTest: Testing User Name");
		assertTrue(userProfile != null);
        
    }
	@Test
    public void testUserProfile2() {
        System.out.println("ProfileTest: Testing User Name");
		assertTrue(userProfile.length() > 0);
        
    }
    
}
