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

// Zee5 searchbox and Logo

public class Excelsheet_Zee5
{
	static Workbook wbf;
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{

// Excel -> console -> UI

		FileInputStream file = new FileInputStream("C:\\Java_Project\\Selenium\\Testdata\\Zee5_File_Read.xlsx");
		wbf = WorkbookFactory.create(file);
		
		String search = getDataFromExcel("Sheet1",3,0);
		System.out.println(search);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zee5.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.findElement(By.xpath("//*[@id='searchInput']")).sendKeys(search);
		Thread.sleep(2000);
			
// UI -> console -> Excel
		
		FileInputStream file1 = new FileInputStream("C:\\Java_Project\\Selenium\\Testdata\\Zee5_File_Write.xlsx");
		wbf = WorkbookFactory.create(file1);
		
		String search1 = driver.findElement(By.xpath("//*[@class='loginBtn noSelect']")).getText();
		System.out.println(search1);
		
		wbf.getSheet("Sheet1").createRow(7).createCell(3).setCellValue(search1);
		
// For one row second cloumn -> use getRow(). for putting second ele you dont have to create new row.
//		String search2 = "Snehal";
//		wbf.getSheet("Sheet1").getRow(7).createCell(4).setCellValue(search2);
		
		FileOutputStream OPfile = new FileOutputStream("C:\\Java_Project\\Selenium\\Testdata\\Zee5_File_Write.xlsx");
		wbf.write(OPfile);
		
		driver.close();
	}
	
	private static String getDataFromExcel(String sheet, int rowindex, int cellindex) 
	{
		return wbf.getSheet(sheet).getRow(rowindex).getCell(cellindex).getStringCellValue();
	}
}