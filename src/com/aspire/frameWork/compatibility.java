package com.aspire.frameWork;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class compatibility 
{

	static WebDriver driver=null;
	@Test
	@Parameters(value = "browserName")
	
	public void chromebrowser(String browser) throws InterruptedException
	{
		if (browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome Browser running");
		}
	
		else if (browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Java_Project\\Selenium\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();
			System.out.println("Edge Browser running");
		}
		else
		{
			System.out.println("Headless browser");
		}
		
		Thread.sleep(7000);
		//driver.close();
	}
}

/*<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  	<parameter name ="browserName" value = "chrome"/>
  	
  <test thread-count="5" name="Test">
     <classes>
      <class name="com.aspire.frameWork.compatibility"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
*/
