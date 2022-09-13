package com.aspire.MultipleElements;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_Flipkart 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//1. Access to website
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		
//2. Close login popup window
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
//3. Display all options
		System.out.println("*****Print all option's text = ");
		List<WebElement> allOptions = driver.findElements(By.xpath("//div[@class='_331-kn _2tvxW']/div/div/div/a/div[2]"));
		for(WebElement options: allOptions)
		{
			System.out.println(options.getText());
		}
		Thread.sleep(2000);
		
//4. Display all options in alphabetical order
		System.out.println("*****Print all option's text in alphabetical order = ");
		TreeSet<String> tr = new TreeSet<String>();
		for(WebElement optionsAlphabetic: allOptions)
		{
			tr.add(optionsAlphabetic.getText());
		}
		System.out.println(tr);
		Thread.sleep(2000);
		
// 5. Select "Grocery" option from list		
		for(WebElement selectOption : allOptions)
		{
			if("Grocery".equals(selectOption.getText()))
			{
				Thread.sleep(5000);
				selectOption.click();
				break;
			}
		}
		
// 6. Close window
		Thread.sleep(2000);
		driver.close();
	}
}
/* Output :
*****Print all option's text = 
Top Offers
Grocery
Mobiles
Fashion
Electronics
Home
Appliances
Travel
Beauty, Toys & More
*****Print all option's text in alphabetical order = 
[Appliances, Beauty, Toys & More, Electronics, Fashion, Grocery, Home, Mobiles, Top Offers, Travel]
*/