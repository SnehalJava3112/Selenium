package com.aspire.frameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelExecution_Chrome {
WebDriver driver;
	
	@Test
	public void chromeBrowser1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver_1\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("chrome running");
		driver.get("http://www.youtube.com");
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void chromeBrowser2() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver_1\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("chrome running");
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.close();
	}
	
	
	
}
/*

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite" parallel="tests">
  
  <test thread-count="5" name="chrome">
    <classes>
      <class name="com.aspire.frameWork.parallelExecution">
      	<methods>
      		<include name = "chromeBrowser"/>
      		<include name = "execution"/>
      	</methods>
      </class>
    </classes>
  </test> <!-- Test -->
  
  <test thread-count="5" name="edge">
    <classes>
      <class name="com.aspire.frameWork.parallelExecution">
      	<methods>
      		<include name = "edgeBrowser"/>
      		<include name = "execution"/>
      	</methods>
      </class>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->

*/