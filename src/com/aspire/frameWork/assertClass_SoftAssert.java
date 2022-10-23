package com.aspire.frameWork;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

// HARD Assert = if one of the line is failed, below that all lines not executed
// its overcome in SOFT Assert that all code executed with failed line

// soft.assertAll(); -> intentionally write in last -> must be in last line 
// if we in middle -> then next code is not executed

public class assertClass_SoftAssert 
{
	String s1 = "Hi";
	String s2 = "Hi";
	String s3 = "Hello";
	String s4 = "Hi";
	
	@Test
	public void softAssert()
	{
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(s1, s2); // same
		System.out.println("s1,s2");
	
		soft.assertEquals(s1, s3); // not same -> fail
		System.out.println("s1,s3");
		
		soft.assertEquals(s1, s4); // same
		System.out.println("s1,s4");
		
		soft.assertAll(); // must be last line
	}
}
