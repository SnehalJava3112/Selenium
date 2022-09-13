package com.aspire.WebDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetWindow_Position
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com/");
		Thread.sleep(2000);
		System.out.println("Default position = "+driver.manage().window().getPosition());
		
		Point p = new Point(300,400);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		System.out.println("Set position = "+driver.manage().window().getPosition());
		
		driver.close();
	}
}
