package com.aspire.PopUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Enter mail id, get text, close the login popup

public class HiddenDivision_PopUp_FB 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//p[@class='_1-pxlW']/span")).getText());
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		driver.close();
	}
}
/* Ouptput:
Get access to your Orders, Wishlist and Recommendations
*/