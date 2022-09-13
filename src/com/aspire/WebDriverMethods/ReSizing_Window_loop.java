package com.aspire.WebDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReSizing_Window_loop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		System.out.println(driver.manage().window().getPosition());
		Thread.sleep(5000);
		
		Point p = new Point(800, 700);
		driver.manage().window().setPosition(p);
		System.out.println(driver.manage().window().getPosition());
	
		for(int i=0; i<=1382; i=i+50)
		{
			for(int j=0; j<=744; j=j+50)
			{
				Point p1 = new Point(i, j);
				driver.manage().window().setPosition(p1);
				System.out.println(driver.manage().window().getPosition());
				Thread.sleep(1000);
			}
		}
		Thread.sleep(1000);
		driver.close();
	}
}