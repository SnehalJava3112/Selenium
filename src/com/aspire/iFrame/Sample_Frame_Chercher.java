package com.aspire.iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//1. Navigate to https://chercher.tech/practice/frames-example-selenium-webdriver
//2. get text "Frames Examples in Selenium Webdriver"
//3. enter text for Topic
//4. click check box
//5. select baby cat from dropdown
//6. uncheck check box

public class Sample_Frame_Chercher 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//1. Navigate to https://chercher.tech/practice/frames-example-selenium-webdriver		
		//driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

//2. get text "Frames Examples in Selenium Webdriver"
		String text = driver.findElement(By.xpath("//h1[@class='breadcrumb-item']")).getText();
		System.out.println("Headline = "+text);
		Thread.sleep(2000);
		
//3. enter text for Topic
		driver.switchTo().frame("frame1");// first have to navigate to "frame1"
		driver.findElement(By.tagName("input")).sendKeys("Selenium");
		Thread.sleep(2000);
		
//4. click check box
		driver.switchTo().frame("frame3");//focus on "frame3"
		driver.findElement(By.xpath("//input[@id='a']")).click();
		Thread.sleep(2000);
		
//5. select baby cat from dropdown(first goto webframe --> parentframe)
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		
		WebElement animal =	driver.findElement(By.xpath("//select[@id='animals']"));
		Select s = new Select(animal);
		s.selectByValue("babycat");
		Thread.sleep(2000);
	
//6. uncheck checkbox
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id='a']")).click();
				
		Thread.sleep(2000);
		driver.close();
	}
}
/* Output:
 Headline = Frames Examples in Selenium Webdriver
 */