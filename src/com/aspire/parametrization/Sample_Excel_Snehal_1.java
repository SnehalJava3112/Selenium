package com.aspire.parametrization;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_Excel_Snehal_1
{
	static Workbook wbf;
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{

// Excel --> console data print
		
		FileInputStream file = new FileInputStream("C:\\Java_Project\\Selenium\\Testdata\\Read_File.xlsx");
		wbf = WorkbookFactory.create(file);
		
// Snehal Dharigouda
		String firstname = getExcelData("Sheet1",2,0);
		System.out.println("First Name = "+firstname);
		
		String surname = getExcelData("Sheet1",2,2);
		System.out.println("Surname = "+surname);
		
// Console --> form
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dypatil.edu/application-form/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys(firstname);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@placeholder='Surname']")).sendKeys(surname);
		Thread.sleep(2000);
		
		driver.close();
		
	}
	
	public static String getExcelData(String sheetName, int rowIndex, int cellIndex)
	{
		String sdata = wbf.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return sdata;
	}
}