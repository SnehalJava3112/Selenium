package com.aspire.frameWork;

import org.testng.annotations.Test;

import graphql.Assert;

public class assertClass_Condition 
{
	// Excel
	Boolean expLogo = true;
	// UI
	Boolean actLogo = false;
	
	@Test
	public void new1()
	{
		Assert.assertTrue(actLogo);
	}
	
	@Test
	public void new2()
	{
		Assert.assertFalse(actLogo);
	}
}
