package com.aspire.keyboardActions;
//enter
//arrow-down, up, right & left
//Customized list box

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions 
{	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\New folder\\June2022_Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://en-gb.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(2000);
	Actions act = new Actions(driver);
	WebElement dayList = driver.findElement(By.xpath("//select[@id='day']"));
//	act.moveToElement(dayList).click().build().perform();
	act.click(dayList).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_DOWN).perform();	//20
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_DOWN).perform();	//21
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_DOWN).perform();	//22
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_DOWN).perform();	//23
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_DOWN).perform();	//24
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_DOWN).perform();	//25
	act.sendKeys(Keys.ENTER).perform();
	
	}
}
