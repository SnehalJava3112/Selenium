package com.aspire.WebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class GetMethodBrowser
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		String key = "webdriver.chrome.driver";
		String value = "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		Thread.sleep(500);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(500);
		
		driver.get("http://www.flipkart.com/");
		Thread.sleep(500);
		
		driver.navigate().back();
		Thread.sleep(500);
		
		driver.navigate().back();
		Thread.sleep(500);
		
		driver.navigate().back();
		Thread.sleep(500);
		
		driver.navigate().forward();
		Thread.sleep(500);
	
		driver.close();
	}
}
