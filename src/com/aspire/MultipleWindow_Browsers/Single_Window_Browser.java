package com.aspire.MultipleWindow_Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Single_Window_Browser
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("wedbriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Samsung Mobiles");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		
//Single window handle
		
		String singleWindowId = driver.getWindowHandle();
		System.out.println(singleWindowId);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(""));
		Thread.sleep(2000);
		
		driver.close();
	}
}
/*

		driver.findElement(By.xpath("//span[contains(text(),'Galaxy M13']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'M32 (Light Blue, 6GB RAM')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Galaxy M13']")).click();
		Set<String> Ids = driver.getWindowHandles();
		System.out.println("**Id for multiple windows**");
		for(String id:Ids)
		{
			System.out.println(id);
		}
		ArrayList<String> al =new ArrayList<String> (Ids);
		//index 0--> homepage, last-->second time open, 1,2,3,4,5--> reverse order of opening
		driver.switchTo().window(al.get(2));	//M32-->index 2
		String M32DeliveryDate = driver.findElement(By.xpath("(//span[@class='a-text-bold'])[3]")).getText();
		System.out.println(M32DeliveryDate);
		
//focus change on different windows
		Thread.sleep(2000);
		driver.switchTo().window(al.get(1));
		Thread.sleep(2000);
		driver.switchTo().window(al.get(3));
		Thread.sleep(2000);
		driver.switchTo().window(al.get(0));
	}
}*/