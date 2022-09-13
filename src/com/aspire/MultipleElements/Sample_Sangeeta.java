package com.aspire.MultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_Sangeeta
{

	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="C:\\\\Java_Project\\\\Selenium\\\\Driver\\\\chromedriver.exe";
		String url="https://www.google.com";
		String searchOption="flipkart";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(2000);
		// for search option
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(searchOption);
		Thread.sleep(2000);
		//print all auto suggetions problem
		System.out.println(">>>>>>>>>>list of autosuggetions options<<<<<<<<<");
		 List<WebElement> autosuggetions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li/div/div[2]/div[1]/span"));
		for(WebElement au:autosuggetions)                               
		{
			System.out.println(au.getText());
		}
		driver.close();
	}
	
}