package com.aspire.browserLaunching;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElement_W3School
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.edge.driver", "C:\\Java_Project\\Selenium\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/");
		Thread.sleep(2000);

		driver.findElement(By.id("search2")).sendKeys("HTML Tutorial ", Keys.ENTER);
		Thread.sleep(5000);
		driver.close();
	}
}
