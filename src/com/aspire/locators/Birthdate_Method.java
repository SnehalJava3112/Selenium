package com.aspire.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Birthdate_Method
{
	public static void main(String[] args) throws InterruptedException

	{
		System.setProperty("webdriver.chrome.driver","C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://www.dypatil.edu/application-form/");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@placeholder='Date of Birth']")).sendKeys("4-02-1936");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='nationality']")).sendKeys("Indian");
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		driver.close();
	}
}