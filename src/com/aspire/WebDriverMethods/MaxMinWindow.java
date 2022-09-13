package com.aspire.WebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class MaxMinWindow
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		String key = "webdriver.chrome.driver";
		String value = "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		Thread.sleep(500);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.w3schools.com/python/default.asp");
		Thread.sleep(2000);
		
		driver.close();
	}
}
