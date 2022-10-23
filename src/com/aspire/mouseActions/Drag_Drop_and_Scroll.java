package com.aspire.mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_and_Scroll 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("(//a[@role='tab'])[3]")).click();
		WebElement dragEle = driver.findElement(By.xpath("//div[@id='dragBox']"));
		WebElement dropTopInner = driver.findElement(By.xpath("//div[@id='notGreedyInnerDropBox']"));
		
//Drag and drop action		
		Actions act= new Actions(driver);
		act.dragAndDrop(dragEle, dropTopInner).perform();

//scroll
		WebElement scrollTarget = driver.findElement(By.xpath("//span[text()='Droppable']"));
		act.scrollToElement(scrollTarget).perform();
		
		driver.close();
	}
}
