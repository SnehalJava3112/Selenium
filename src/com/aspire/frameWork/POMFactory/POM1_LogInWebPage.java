package com.aspire.frameWork.POMFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class POM1_LogInWebPage
{
	@FindBy (xpath = "//input[@id='RememberMe']") private WebElement chkBox;
	@FindBy (xpath = "//input[@id='Email']") private WebElement email;
	@FindBy (xpath = "//input[@id='Password']") private WebElement pwd;
	@FindBy (xpath = "//button[@type='submit']") private WebElement submit;
	
	public POM1_LogInWebPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
// title
		String expeTitle = "Your store. Login";	// excel
		@Test
		public void titleValidation(WebDriver driver)
		{
			String actTitle = driver.getTitle();
			
			if(actTitle.equals(expeTitle))
			{
				System.out.println("Title test case passed");
			}
			else
			{
				System.out.println("Title test case failed");
			}
		}

// checkbox -> default non selected
		@Test
		public void chkValidation()
		{
			boolean actChkResult = chkBox.isSelected(); //driver.findElement(By.xpath("//input[@id='RememberMe']")).isSelected();
			boolean expChkResult = false;
			
			if(actChkResult == expChkResult)
			{
				System.out.println("Default checkbox selected");
			}
			else
			{
				System.out.println("Default checkbox not selected");
			}
		}

// Enter username
		@Test
		public void emailValidation()
		{
			email.clear();
			email.sendKeys("admin@yourstore.com");   //driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@yourstore.com");
		}
	
// Enter password
		@Test
		public void pwdValidation()
		{
			pwd.clear();
			pwd.sendKeys("admin");    //driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("admin");
		}
		
// login button
		@Test
		public void submitValidation()
		{
			submit.click();//driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
}