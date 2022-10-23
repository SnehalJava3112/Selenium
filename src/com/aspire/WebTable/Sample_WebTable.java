package com.aspire.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_WebTable 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/List_of_states_and_union_territories_of_India_by_population");
		
//1. Print a cell (Second row from table)
		String cellText = driver.findElement(By.xpath("(//td[@style='text-align: left;'])[2]")).getText();
		System.out.println("Second line of table text = "+cellText);
		Thread.sleep(2000);
//2. Print a column
		List <WebElement> densityColumn = driver.findElements(By.xpath("//table[contains(@class,'wikitable sortable jquery-tablesorter')]/tbody/tr/td[10]"));
		for(WebElement temp : densityColumn)
		{
			System.out.println(temp.getText());
		}
		System.out.println("Number of rows in table body = "+densityColumn);
		Thread.sleep(2000);
		
//3. Print 
		Thread.sleep(2000);
		driver.close();
	}
}

/*
 package com.aspire.webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\June2022_Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/List_of_states_and_union_territories_of_India_by_population");
		Thread.sleep(2000);
//1. print a cell
		System.out.println("***Cell print form 2nd row & 2nd column from table body***");
		String cellText = driver.findElement(By.xpath("(//td[@style='text-align: left;'])[2]")).getText();
		System.out.println(cellText);
//2. print a column
		System.out.println("***Population density Column print form table body***");
		List<WebElement> densityColumn = driver.findElements(By.xpath("//table[contains(@class,'jquery-tablesorter')]/tbody/tr/td[10]"));
		for(WebElement temp:densityColumn)
		{
			System.out.println(temp.getText());
		}
		System.out.println("Number of rows in table body ="+densityColumn.size());
// Row count & column count		
//3. print a row
		System.out.println("***6th Row print form table body***");
		List<WebElement> row = driver.findElements(By.xpath("//table[contains(@class,'jquery-tablesorter')]/tbody/tr[6]/td"));
		for(WebElement temp:row)
		{
			System.out.print(temp.getText()+"  |  ");
		}
		int columnCount = row.size();
		System.out.println("\nNumber of columns in Table="+columnCount);
//4. print header
		System.out.println("*Table header**");
		List<WebElement> header = driver.findElements(By.xpath("//th[@class='headerSort']"));
		for(WebElement head:header)
		{
			System.out.print(head.getText()+"  |  ");
		}
//5. full Table
		//header+tablebody
		//11*37=407
		
	}
}
 
*/