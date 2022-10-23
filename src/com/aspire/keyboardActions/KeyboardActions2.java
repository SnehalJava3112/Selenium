package com.aspire.keyboardActions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions2 
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
	int dayCount = driver.findElements(By.xpath("//select[@id='day']/option")).size();
//	act.moveToElement(dayList).click().build().perform();
	act.click(dayList).perform();
	Thread.sleep(2000);
	
	for(int i=1; i<=dayCount;i++)
	{
	act.sendKeys(Keys.ARROW_DOWN).perform();	
	Thread.sleep(2000);
	}
	
	for(int i=0; i<6; i++)
	{
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
	}
	
	act.sendKeys(Keys.ENTER).perform();
	}
}
