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
import org.openqa.selenium.io.FileHandler;

//Navigate to Zerodha
//take screenshot of full webpage
//take screenshot of logo --> //img[@class='landing-image']


public class ScreenShot_Zerodha
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//1. Navigate to Zerodha
		//driver.manage().window().maximize();
		driver.get("https://www.zerodha.com/");
		Thread.sleep(2000);
		
//2. take screenshot of full webpage by timestamp		
		TakesScreenshot t = (TakesScreenshot)driver;
		File source = t.getScreenshotAs(OutputType.FILE);
		System.out.println("Source path = "+source);
		
		Date d = new Date();
		String timestamp = d.toString().replace(":", "_").replace(" ", "_");
		File desti_1 = new File("C:\\Java_Project\\Selenium\\Screenshot\\Zerodha\\"+timestamp+".jpg");
		FileHandler.copy(source, desti_1);		
		Thread.sleep(2000);

//3.take screenshot of logo
		WebElement singleImage = driver.findElement(By.xpath("//img[@class='landing-image']"));
		File src = singleImage.getScreenshotAs(OutputType.FILE);
		File desti_2 = new File("C:\\Java_Project\\Selenium\\Screenshot\\Zerodha\\Logo.jpg");
		System.out.println("Single image src = "+src);
		FileHandler.copy(src, desti_2);
		
		Thread.sleep(2000);
		driver.close();
	}
}
/* Output:
 
Source path = C:\Users\Snehal\AppData\Local\Temp\screenshot17331302342334609466.png
Single image src = C:\Users\Snehal\AppData\Local\Temp\screenshot16541466264895127121.png
*/