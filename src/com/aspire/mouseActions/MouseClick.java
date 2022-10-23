package com.aspire.mouseActions;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClick 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);	
		
//double click
		WebElement doubleClickBtn = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(doubleClickBtn).perform();
		
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
//context click--> right click	
		WebElement rightClickBtn = driver.findElement(By.xpath("//span[contains(@class,'context-menu-')]"));
		act.contextClick(rightClickBtn).perform();
	}
}