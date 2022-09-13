package com.aspire.MultipleElements;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_Google
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
//1. Search 'Flipkart' word	
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Flipkart");
		Thread.sleep(2000);
		
//2. Print all suggestions
		System.out.println("All auto-suggestion options = ");
		
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li/div/div[2]/div[1]/span"));
		for(WebElement option : autoSuggestions)
		{
			System.out.println(option.getText());
		}
		Thread.sleep(2000);		
		
//3. Print all suggestions in alphabetical order
// By using treeset
		TreeSet<String> tr = new TreeSet<String>();	// TreeSet is by default sorted
		for(WebElement option:autoSuggestions)
		{
			tr.add(option.getText());
		}
		System.out.println("All suggestions in an alphabetical order = "+tr);
		Thread.sleep(2000);
		
//4. Select "flipkart big billion days" from autosuggestion
		for(WebElement option : autoSuggestions)
		{
			if("flipkart big billion days".equals(option.getText()));
			{
				option.click();
				break;
			}
		}
		Thread.sleep(2000);
	
		driver.close();
	}
}
