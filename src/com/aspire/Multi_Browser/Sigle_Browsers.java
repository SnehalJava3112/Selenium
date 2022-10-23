package com.aspire.Multi_Browser;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Sigle_Browsers 
{

	public static void main(String[] args) throws InterruptedException 
	{
// Edge browser		
//		System.setProperty("webdriver.edge.driver", "C:\\Java_Project\\Selenium\\Driver\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
		
// chrome browser
//		System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
// Mozilla firefox browser
//		System.setProperty("webdriver.gecko.driver", "C:\\Java_Project\\Selenium\\Driver\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
// Headless browsing
		WebDriver driver = new HtmlUnitDriver();
		
		//driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		
		String text = driver.findElement(By.xpath("(//h2[@class='_2cAig-'])[1]")).getText();
		System.out.println("Text of line = "+text);
		Thread.sleep(2000);
		
		System.out.println("Success");
		driver.close();
	}
}