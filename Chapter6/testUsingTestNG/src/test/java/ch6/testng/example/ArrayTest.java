package ch6.testng.example;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArrayTest {
	
	private ArrayList<String> arr;
	
	@BeforeClass(alwaysRun = true)
	public void setup(){
		arr = new ArrayList<String>();
	}
	
	@AfterMethod(alwaysRun = true)
	public void cleantask(){
		arr.clear();
	}
	
	@Test(groups = "Smoke")
	public void verifyArraySize(){
		Assert.assertEquals(arr.size(), 0);
		arr.add("first");
		arr.add("second");
		arr.add("third");
		Assert.assertEquals(arr.size(), 3);
	}
	
	@Test(groups = "Smoke")
	public void verifyArrayNotNull(){
		Assert.assertNotNull(arr);
		
	}
	
	@Test(groups = "Integration")
	public void verifyArrayPosition(){
		arr.add("first");
		arr.add(1, "second");
		arr.add(2, "fourth");
		Assert.assertEquals(arr.size(), 3);
	}

	
}