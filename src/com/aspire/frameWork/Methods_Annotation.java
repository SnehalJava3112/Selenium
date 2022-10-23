package com.aspire.frameWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Methods_Annotation
{
	WebDriver driver = null;
	
	@BeforeClass
	public void browserLaunch()
	{		
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Chrome Browser running");
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	@BeforeMethod
	public void userName() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		Thread.sleep(3000);
	}
	
	@Test(priority=3)
	public void password() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abc123");
		Thread.sleep(3000);
	}
	@Test(priority=4)
	public void login()
	{
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
}
