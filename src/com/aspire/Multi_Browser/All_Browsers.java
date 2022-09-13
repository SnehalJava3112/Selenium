package com.aspire.Multi_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class All_Browsers 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = null;
		String browser = "chromeA";
		
//Edge browser
		if(browser.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Java_Project\\Selenium\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
// chrome browser
		else if((browser.equals("chrome")))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
// Mozilla firefox browser
		else if((browser.equals("firefox")))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Java_Project\\Selenium\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
// Headless browsing
		else 
		{
			driver = new HtmlUnitDriver();
		}	
			
		//driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000); 
		
		String text = driver.findElement(By.xpath("(//h2[@class='_2cAig-'])[1]")).getText();
		System.out.println("Text of line = "+text);
		Thread.sleep(2000);
		
		System.out.println("Pass");
		driver.close();
	}
}
