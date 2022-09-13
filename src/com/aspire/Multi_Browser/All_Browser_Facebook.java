package com.aspire.Multi_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class All_Browser_Facebook
{
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = null;
		String browser = "";
		if (browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome Browser running");
		}
		else if (browser.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Java_Project\\Selenium\\Driver\\msedgedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Edge Browser running");
		}
		else if (browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Java_Project\\Selenium\\Driver\\geckodriver.exe");
			driver = new ChromeDriver();
			System.out.println("FireFox Browser running");
		}
		else
		{
			driver = new HtmlUnitDriver();
			System.out.println("Html Unit Driver running");
		}
		
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		String text = driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
		System.out.println("facebook info line = "+text);
		Thread.sleep(2000);
		
		driver.close();
	}
}
/* Output:
Html Unit Driver running
facebook info line = Facebook helps you connect and share with the people in your life.
*/