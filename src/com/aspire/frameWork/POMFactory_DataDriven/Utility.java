package com.aspire.frameWork.POMFactory_DataDriven;

import java.io.FileInputStream;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//Excel read write screenshot properties file

public class Utility
{

	FileInputStream file;
	static Workbook wbf;
	
	public static String excelStringData(String sheetname, int rowindex, int cellindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Java_Project\\Selenium\\Testdata\\DataDriven.xlsx");
		wbf = WorkbookFactory.create(file);
		
		return wbf.getSheet(sheetname).getRow(rowindex).getCell(cellindex).getStringCellValue();
	}
	
	public static boolean excelBooleanData(String sheetname, int rowindex, int cellindex)
	{
		return wbf.getSheet(sheetname).getRow(rowindex).getCell(cellindex).getBooleanCellValue();
	}
	
	public static double excelNumericData(String sheetname, int rowindex, int cellindex)
	{
		return wbf.getSheet(sheetname).getRow(rowindex).getCell(cellindex).getNumericCellValue();
	}
}