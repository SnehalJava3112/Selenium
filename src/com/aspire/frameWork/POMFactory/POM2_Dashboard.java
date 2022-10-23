package com.aspire.frameWork.POMFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class POM2_Dashboard 
{
	@FindBy (xpath = "//img[@class='brand-image-xl logo-xl']") private WebElement logo;

// Logo display
	
	public POM2_Dashboard(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@Test
	public void logoValidation()
	{
		boolean actLogoResult = logo.isDisplayed();		//driver.findElement(By.xpath("(//img[@alt='logo.png'])[2]")).isDisplayed();
		boolean expLogoResult = true;
		
		System.out.println("exp"+expLogoResult);		
		System.out.println("act"+actLogoResult);
		
		if(expLogoResult == actLogoResult)
			System.out.println("Logo Displayed");
		else
			System.out.println("Logo not Displayed");		
	}
}
