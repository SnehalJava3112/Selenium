package com.aspire.iFrame;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample_iframe
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Java_Project\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		
		// Mozilla firefox browser
//		System.setProperty("webdriver.gecko.driver", "C:\\Java_Project\\Selenium\\Driver\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame2");
		System.out.println("In frame2 Animal");
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame1");
		System.out.println("In frame1 checkbox");
		
		driver.switchTo().frame("frame3");
		System.out.println("In small frame3");
		
		driver.switchTo().defaultContent();
		System.out.println("In default");
		
		driver.switchTo().frame("frame3");
		System.out.println("In small frame3");
		
		Thread.sleep(2000);
		driver.close();
	}
}
