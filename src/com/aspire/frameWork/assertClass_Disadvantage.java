package com.aspire.frameWork;
import org.testng.Assert;
import org.testng.annotations.Test;

// HARD Assert = if one of the line is failed, below that all lines not executed
// its overcome in SOFT Assert

public class assertClass_Disadvantage
{
	String s1 = "Hi";
	String s2 = "Hi";
	String s3 = "Hello";
	String s4 = "Hi";
	
	@Test
	public void disadv()
	{
		Assert.assertEquals(s1, s2); // same
		System.out.println("s1,s2");
	
		Assert.assertEquals(s1, s3); // not same
		System.out.println("s1,s3");
		
		Assert.assertEquals(s1, s4); // same
		System.out.println("s1,s4");
	}
}
