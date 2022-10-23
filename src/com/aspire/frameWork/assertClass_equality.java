package com.aspire.frameWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertClass_equality
{
	String expectedText = "My name is Snehal.";
	String actualText = "My name is snehal.";
	
	@Test
	public void conventional()
	{
		if(actualText.equals(expectedText))
			System.out.println("Test case is passed.");
		else
			System.out.println("Test case is failed.");
	}
	
	@Test
	public void equalString()
	{
		Assert.assertEquals(actualText, expectedText, "Two are diff strings");
	}
	@Test
	public void notEqualString()
	{
		Assert.assertNotEquals(actualText, expectedText, "Two are same strings");
	}
}

