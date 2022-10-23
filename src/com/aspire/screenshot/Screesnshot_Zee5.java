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

public class Screesnshot_Zee5
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icicibank.com/");
	
		TakesScreenshot t = (TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
	
		Date d = new Date();
		String time = d.toString().replace(":", "_").replace(" ", "_");
	
		File dest = new File("C:\\Java_Project\\Selenium\\Screenshot\\ICICI\\Img."+time+".jpg");
		Thread.sleep(5000);
		
		FileHandler.copy(src, dest);

		WebElement elementScreenshot = driver.findElement(By.xpath("(//img[@alt='ICICI LOGO'])[1]"));
		File src1 = elementScreenshot.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("C:\\Java_Project\\Selenium\\Screenshot\\ICICI\\Logo."+time+".jpg");
		FileHandler.copy(src1, dest1);
		driver.close();
	}
}