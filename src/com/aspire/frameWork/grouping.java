package com.aspire.frameWork;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class grouping 
{
	@Test(groups = "login")
	public void tc1()
	{
		Reporter.log("login");
	}
	
	@Test
	public void tc2()
	{
		Reporter.log("logout");
	}
	
	@Test(groups = "payment")
	public void tc3()
	{
		Reporter.log("payment");
	}
	
	@Test(groups = "payment")
	public void tc4()
	{
		Reporter.log("payment2");
	}
}
/*
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Test">
  <groups>
  	<run>
  		<include name = "payment"/>
  	</run>
  </groups>
    <classes>
      <class name="com.aspire.frameWork.grouping"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->

*/