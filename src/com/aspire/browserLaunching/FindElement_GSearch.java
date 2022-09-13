package com.aspire.browserLaunching;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElement_GSearch
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.edge.driver", "C:\\Java_Project\\Selenium\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("Java basics", Keys.ENTER);
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.javatpoint.com/java-basics");
		Thread.sleep(2000);
		driver.close();
	}
}