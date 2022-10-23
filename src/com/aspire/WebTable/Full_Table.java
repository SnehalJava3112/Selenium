package com.aspire.WebTable;

public class Full_Table 
{
	public static void main(String[] args) 
	{
		
	}
}


/*package com.aspire.webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullTable 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\June2022_Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/List_of_states_and_union_territories_of_India_by_population");
		Thread.sleep(2000);
//print header
		System.out.println("*Table header**");
		List<WebElement> header = driver.findElements(By.xpath("//th[@class='headerSort']"));
		for(WebElement head:header)
		{
			System.out.print(head.getText()+"  |  ");
		}
		System.out.println();
//table body
		
		List<WebElement> densityColumn = driver.findElements(By.xpath("//table[contains(@class,'jquery-tablesorter')]/tbody/tr/td[10]"));
		int rowCount=densityColumn.size();
		int columnCount=header.size();
		for(int i=1; i<=rowCount; i++)
		{
			for(int j=1; j<=columnCount; j++)
			{
		String tableElements = driver.findElement(By.xpath("//table[contains(@class,'jquery-tablesorter')]/tbody/tr["+i+"]/td["+j+"]")).getText();
			System.out.print(tableElements+"  |  ");
			}
			System.out.println();
		}	
		
	}
}*/