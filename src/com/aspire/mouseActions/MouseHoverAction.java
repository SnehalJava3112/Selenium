package com.aspire.mouseActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://licindia.in/");
		Thread.sleep(2000);

//single element
		WebElement custServices = driver.findElement(By.xpath("(//li[@class='bar has-sub'])[3]"));
		
		Actions act= new Actions(driver);
		act.moveToElement(custServices).perform();
		Thread.sleep(5000);
		
//multiple element
		List<WebElement> multiEle = driver.findElements(By.xpath("//div[@class='tab-left']/ul/li/a"));
		
		for(WebElement ele:multiEle)
		{
			act.moveToElement(ele).perform();
			Thread.sleep(2000);
		}
	}
}