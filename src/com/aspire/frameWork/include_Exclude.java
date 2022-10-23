package com.aspire.frameWork;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class include_Exclude 
{
	@Test(enabled = false)
	public void tc1()
	{
		Reporter.log("TC1");
	}
	@Test
	public void tc2()
	{
		Reporter.log("TC2");
	}
	@Test
	public void tc3()
	{
		Reporter.log("TC3");
	}
}
/*
 
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Test">
    <classes>
      <class name="com.aspire.frameWork.Sample">
      	<methods>
      		<exclude name = "tc2"/>
      		<include name = "tc3"/>
      	</methods>
      </class>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->

*/