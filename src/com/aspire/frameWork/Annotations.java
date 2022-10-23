package com.aspire.frameWork;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations 
{
	@Test
	public void method1()
	{
		System.out.println("Method 1");
	}
	@Test
	public void method2()
	{
		System.out.println("Method 2");
	}
	@BeforeMethod
	public void method3()
	{
		System.out.println("Method 3");
	}
	@BeforeSuite
	public void method4()
	{
		System.out.println("Method 4");
	}
	@BeforeClass
	public void method5()
	{
		System.out.println("Method 5");
	}
	@BeforeGroups
	public void method6()
	{
		System.out.println("Method 6");
	}
	@BeforeTest
	public void method7()
	{
		System.out.println("Method 7");
	}
	@BeforeMethod
	public void method8()
	{
		System.out.println("Method 8");
	}
	
}