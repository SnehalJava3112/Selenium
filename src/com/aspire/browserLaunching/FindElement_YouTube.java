package com.aspire.browserLaunching;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElement_YouTube 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.edge.driver", "C:\\Java_Project\\Selenium\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("search_query")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("search_query")).sendKeys("Tom and Jerry", Keys.ENTER);
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.youtube.com/watch?v=t0Q2otsqC4I");
		Thread.sleep(2000);
		
		driver.close();
	}
}

