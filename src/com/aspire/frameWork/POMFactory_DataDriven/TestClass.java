package com.aspire.frameWork.POMFactory_DataDriven;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass
{
	WebDriver driver = null;
	static Workbook wbf;
	
	@Test
	public void broserLaunch() throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		POM1_LogInWebPage p1 = new POM1_LogInWebPage(driver);
		
		p1.titleValidation(driver);		Thread.sleep(2000);
//		p1.chkBoxValidation();			Thread.sleep(2000);
//		p1.emailValidation();		Thread.sleep(2000);
//		p1.pwdValidation();			Thread.sleep(2000);
//		p1.submitValidation();		Thread.sleep(2000);
//	
//		POM2_Dashboard p2 = new POM2_Dashboard(driver);
//		p2.logoValidation();		
		Thread.sleep(2000);
	}
	@Test
	public void closing()
	{
		driver.close();
	}
}
