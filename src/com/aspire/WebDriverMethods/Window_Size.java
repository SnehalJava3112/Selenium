package com.aspire.WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Size
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("http://www.google.com/");
		// default size of window
		System.out.println("Defalut size = "+driver.manage().window().getSize());
		
		Dimension d = new Dimension(600, 400);
		driver.manage().window().setSize(d);
		
		// set size values of window
		System.out.println("Set size = "+driver.manage().window().getSize());
		Thread.sleep(2000);
		
		// max size of window
		driver.manage().window().maximize();
		System.out.println("Max size = "+driver.manage().window().getSize());
		Thread.sleep(2000);
		
		driver.close();
	}
}
