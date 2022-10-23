package com.aspire.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_LogIn 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("email")).sendKeys("pineapple@gmail.com");
		Thread.sleep(1000);
	
		driver.findElement(By.id("pass")).click();
		Thread.sleep(1000);	
		
		String text = driver.findElement(By.className("_8eso")).getText();
		System.out.println(text);		
		Thread.sleep(1000);
		
//		driver.findElement(By.linkText("Forgotten password?")).click();
//		Thread.sleep(1000);
// or	
		driver.findElement(By.partialLinkText("gotten passw")).click();
		Thread.sleep(2000);
	

		driver.findElement(By.cssSelector("#identify_email")).sendKeys("pineapple@gmail.com");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@name='did_submit']")).click();
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//input[@name='recover_method' and @id='send_email']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@name='reset_action']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("recovery_code_entry")).click();
		driver.findElement(By.id("recovery_code_entry")).sendKeys("123456");
		Thread.sleep(1000);
	
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("pineapple@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("pass")).sendKeys("abc@123");		
		
		driver.findElement(By.xpath("//button[@name='login' and @type='submit']"));
		Thread.sleep(1000);
		
		driver.navigate().to("https://en.wikipedia.org/wiki/Facebook");
		Thread.sleep(3000);
		System.out.println("Successfully Login to Facebook...");
		driver.close();		
	}
}