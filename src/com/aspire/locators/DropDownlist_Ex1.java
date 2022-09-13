package com.aspire.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownlist_Ex1
{
	public static void main(String[] args) throws InterruptedException

	{
		System.setProperty("webdriver.chrome.driver","C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.get("http://www.dypatil.edu/application-form/");
		Thread.sleep(2000);
		
		WebElement schoolName = driver.findElement(By.xpath("//select[@id='school']"));
		Select s= new Select(schoolName);

//getOptions--> to get all options in list box	
		List<WebElement> allOptions = s.getOptions();
		for(WebElement option:allOptions)
		{
			System.out.println(option.getText());
		}

//select by index (index start with 0, Ayurveda-3)		
		s.selectByIndex(3);
		Thread.sleep(1000);	
	}
}

/*
//select by value	
		s.selectByValue("School of Pharmacy");
		Thread.sleep(2000);

//select by visible text
		selectByVisibleText("RAIT (School of Engineering )");
		Thread.sleep(2000);	
		
//deslect
		//s.deselectByVisibleText("RAIT (School of Engineering )");
		//s.deselectAll();

//getAllSelectedOptions--> multi selectable list box-->all selected options	
		List<WebElement> selectedOptions = s.getAllSelectedOptions();
		for(WebElement option:selectedOptions)
		{
			System.out.println(option.getText());
		}
		
//getFirstSelectedOption--> default/latest selected option		
		System.out.print("getFirstSelectedOption = ");
		System.out.println(s.getFirstSelectedOption().getText());
		
		
//getAllSelectedOptions--> multi selectable list box-->all selected options
		List<WebElement> selectedOptions = s.getAllSelectedOptions();
		for(WebElement option:selectedOptions)
		{
			System.out.println(option.getText());
		}
*/