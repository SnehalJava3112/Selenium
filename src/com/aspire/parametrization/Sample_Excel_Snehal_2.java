package com.aspire.parametrization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_Excel_Snehal_2 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
// Form --> Console
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("http://www.dypatil.edu/application-form/");
		
		String headerText = driver.findElement(By.xpath("//h1[@class='title text-center']")).getText();
		System.out.println(headerText);

// Console --> Excel
		FileInputStream IPFile = new FileInputStream("C:\\Java_Project\\Selenium\\Testdata\\Write_File.xlsx");
		
		Workbook wbf = WorkbookFactory.create(IPFile);
		wbf.getSheet("Sheet2").createRow(5).createCell(5).setCellValue(headerText);
		
		FileOutputStream OPFile = new FileOutputStream("C:\\Java_Project\\Selenium\\Testdata\\Write_File.xlsx");
		wbf.write(OPFile);	
		
		driver.close();
	}
}