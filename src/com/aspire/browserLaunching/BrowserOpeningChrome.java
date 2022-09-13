package com.aspire.browserLaunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserOpeningChrome 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.edge.driver", "C:\\Java_Project\\Selenium\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");	
		
		Thread.sleep(2000);
		driver.close();
	}
}
