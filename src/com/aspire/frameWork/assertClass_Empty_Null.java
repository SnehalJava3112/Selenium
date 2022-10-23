package com.aspire.frameWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertClass_Empty_Null 
{
	// Excel and UI
	String actText = null;
	@Test
	public void CheckNull()
	{
		Assert.assertNull(actText);
	}
	
	@Test
	public void new2()
	{
		Assert.assertNotNull(actText); // need some text
	}
}
