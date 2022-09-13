package com.aspire.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
1. Launch https://chercher.tech/practice/practice-dropdowns-selenium-webdriver
2. Select google in products
3. Select Iphone in products
4. Select Baby Cat in Animals
5. Print all options from Animals list box
6. Select Pizza, Burger and Bonda in Multiselectable list box
7. Deselect Burger
8. Print selected options
9. Print all options
10. Deselect all options
*/

public class DropDown_Ex2
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//1.Launch website
		//driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		Thread.sleep(1000);
		
//2.Select google in products (select by value)
		WebElement product = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[1]"));
		Select s = new Select(product);
		s.selectByValue("Google");
		Thread.sleep(2000);

//3.Select Iphone in products (select by index)
		s.selectByIndex(2);
		Thread.sleep(2000);
		
//4. Select Baby Cat in Animals
		WebElement animal = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[2]"));
		Select ss = new Select(animal);
		ss.selectByVisibleText("Baby Cat");
		Thread.sleep(2000);

//5. Print all options from Animals list box
		System.out.print("All options from Animals : ");
		List<WebElement> allOptions_animal = ss.getOptions();
		for(WebElement option:allOptions_animal)
		{
			System.out.println(option.getText());
		}
		System.out.println();
		
//6. Select Pizza, Burger and Bonda in Multiselectable list box
		WebElement food = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[3]"));
		Select sss = new Select(food);
		
		sss.selectByValue("pizza");
		Thread.sleep(2000);
		sss.selectByValue("burger");
		Thread.sleep(2000);
		sss.selectByValue("bonda");
		Thread.sleep(2000);
		
		System.out.print("Pizza, Burger and Bonda in Multiselectable : ");
		List<WebElement> m_selectedOptions = sss.getAllSelectedOptions();
		for(WebElement optionF:m_selectedOptions)
		{
			System.out.println(optionF.getText());
		}
		System.out.println();
		
//7. Deselect Burger
		sss.deselectByVisibleText("Burger");
		Thread.sleep(2000);
		
//8. Print selected options		
		System.out.print("Print selected options : ");
		List<WebElement> selectedOptions = sss.getAllSelectedOptions();
		for(WebElement optionF:selectedOptions)
		{
			System.out.println(optionF.getText());
		}
		System.out.println();
		
//9. Print all options
		System.out.print("Print all options from food : ");
		List<WebElement> allOptions_food = sss.getOptions();
		for(WebElement option:allOptions_food)
		{
			System.out.println(option.getText());
		}
		
//10. Deselect all options
		sss.deselectAll();
		Thread.sleep(2000);
		driver.close();		
	}
}

/*
All options from Animals : Cat
Baby Cat
Big Baby Cat
Avatar

Pizza, Burger and Bonda in Multiselectable : Pizza
Burger
Bonda

Print selected options : Pizza
Bonda

Print all options from food : Pizza
Donut
Burger
Bonda
*/