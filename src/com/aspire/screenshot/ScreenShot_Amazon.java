package com.aspire.screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v102.database.Database;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot_Amazon
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		
//1. full webpage screenshot
		
		TakesScreenshot t = (TakesScreenshot)driver;
		File source = t.getScreenshotAs(OutputType.FILE);
		System.out.println("Original path of screenshot file = "+source);

//(1). Single name screenshot
		File desti = new File("C:\\Java_Project\\Selenium\\Screenshot\\Amazon\\Snehal.jpg"); 
		FileHandler.copy(source, desti);
		Thread.sleep(2000);
		
//(2). Unique name for screenshot
	//a. By using timestamp
		Date d = new Date();
		String timestamp = d.toString().replace(":","_").replace(" ", "_");
		File desti_1 = new File("C:\\Java_Project\\Selenium\\Screenshot\\Amazon\\"+timestamp+".jpg"); 
		FileHandler.copy(source, desti_1);
		System.out.println("Recent timestamp = "+timestamp);
		Thread.sleep(2000);
		
	//b. By random string name - 10 names
//		for(int i=1; i<10; i++)
//		{			
//			String randomName = RandomString.make(5);
//			System.out.println(randomName);			
//		}
		
		String randomName = RandomString.make(5);
		System.out.println("Random file name = "+randomName);
		File desti_2 = new File("C:\\Java_Project\\Selenium\\Screenshot\\Amazon\\"+randomName+".jpg"); 
		FileHandler.copy(source, desti_2);
		
		
//2). Single image screenshot
		
		WebElement elementScreenshot = driver.findElement(By.xpath("//img[@alt='Keyboards']"));
		File src = elementScreenshot.getScreenshotAs(OutputType.FILE);
		File desti_3 = new File("C:\\Java_Project\\Selenium\\Screenshot\\Amazon\\SingleImage_1.jpg");
		FileHandler.copy(src, desti_3);
		
		Thread.sleep(2000);
		driver.close();
	}
}
