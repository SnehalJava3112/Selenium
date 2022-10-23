package com.aspire.frameWork;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

// enabled => by default=true 
// invocationCount => 1 by default
// timeout => need more time than sleeptime
//      	=> if less time gives error
// dependsOnMethod -> logout id depends on login page 
//					->(skipped logout code if login code fails)
// Assert.fail => // static -> fail the method intentionally
// Reporting.log("", true) -> printing in report -> like logs
//						   -> true = console + report
//						   -> without true = only report


public class Keywords 
{
	@Test (invocationCount = 2)  // run this test in no of times
	public void method1()
	{
		System.out.println("Browser launch");
		System.out.println("Launch URL");
		System.out.println("Login-Login");
		Reporter.log("Printing data in report", true);
	}
	
	@Test(enabled = false) // skipping method
	public void method2()
	{
		System.out.println("Method=2");
	}
	
//	@Test (timeOut = 1000) // wait till 1 sec
//	public void method3() throws InterruptedException
//	{
//		Thread.sleep(2000);  // but here wait is 2 sec, so cannot run code
//		System.out.println("Method=3");
//	}
	
	@Test (timeOut = 3000) // wait till 3 sec
	public void method3() throws InterruptedException
	{
		Thread.sleep(2000);  // but here wait is 2 sec, so run code
		System.out.println("Method=3");
	}
	
	@Test
	public void login()
	{
		Assert.fail();  // static -> fail the method intentionally
		System.out.println("Login to app");
	}
	
	@Test (dependsOnMethods = "login") 			//(dependsOnMethods = {"login", "method3"})  // skipped code if login is failed
	public void logout()
	{
		System.out.println("Logout from app");
	}
}