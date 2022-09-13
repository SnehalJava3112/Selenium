package com.aspire.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample
{
	public static void main(String[] args) throws InterruptedException
	{
		String key="webdriver.chrome.driver";
		String value="C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe";
		String url="http://www.dypatil.edu/application-form/";
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get(url);
	    /*
	    WebElement schoolname=driver.findElement(By.xpath("//select[@id='school']"));
	    Thread.sleep(2000);
	    Select s= new Select(schoolname);
	    s.selectByIndex(3);
	    Thread.sleep(2000);
	    s.selectByValue("School of Pharmacy");
	    Thread.sleep(2000);
	   
	    s.selectByVisibleText("School of Hospitality & Tourism Studies");
	    Thread.sleep(1000);
	    WebElement level=driver.findElement(By.xpath("//select[@id='level']"));
	    Thread.sleep(2000);
	    Select l= new Select(level);
	    l.selectByValue("After 10+2");
	    Thread.sleep(1000);
	    WebElement coursename=driver.findElement(By.xpath("//select[@id='course_name']"));
	    Select cn=new Select(coursename);
	    cn.selectByValue("B.Sc Hospitality Studies - VPSM");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("sangeeta");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@name='middle_name']")).sendKeys("prashant");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@name='surname']")).sendKeys("Namdeo");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@name='mother_tongue']")).sendKeys("hindi");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//input[@name='gender'])[1]")).click();
		 boolean maleSelected = driver.findElement(By.xpath("(//input[@name='gender'])[1]")).isSelected();
		 System.out.println("Male option selected ="+maleSelected);
		 driver.findElement(By.xpath("//input[@name='nationality']")).sendKeys("indian");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("hindu");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("a+");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//input[@type='text'])[9]")).clear();
		 driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("b+");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//input[@name='category'])[1]")).click();
		 boolean openct= driver.findElement(By.xpath("(//input[@name='category'])[1]")).isSelected();
		 boolean stct=driver.findElement(By.xpath("(//input[@name='category'])[2]")).isSelected();
		 boolean scct=driver.findElement(By.xpath("(//input[@name='category'])[3]")).isSelected();
		 boolean otherct= driver.findElement(By.xpath("(//input[@name='category'])[4]")).isSelected();
		 System.out.println("open selected = "+ openct);
		 System.out.println("st selected = "+ stct);
		 System.out.println("sc selected = "+ scct);
		 System.out.println("other selected = "+ otherct);
		// boolean maleSelected = driver.findElement(By.xpath("(//input[@name='gender'])[1]")).isSelected();
		 driver.findElement(By.xpath("(//label[@class='labeled required'])[2]")).click();
//		 boolean first= driver.findElement(By.xpath("(//label[@class='labeled required'])[2]")).isSelected();
//		 System.out.println("first selected = "+ first);
//		WebElement dob= driver.findElement(By.xpath("//input[@name='dob']"));
//		Select date=new Select(dob);
//		date.selectByValue("01-11-2000");
		 driver.findElement(By.xpath("//input[@name='address_line_one']")).sendKeys("Rivera");
		 Thread.sleep(1000);
		 WebElement country =driver.findElement(By.xpath("//select[@name='address_country']"));
		 Select cn1=new Select(country);
		 cn1.selectByValue("IN");
		 driver.findElement(By.xpath("//input[@name='address_state']")).sendKeys("maharashtra");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@name='address_city']")).sendKeys("pune");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@name='address_pincode']")).sendKeys("411045");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("xyz@yahoo.com");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("+912000030000");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@name='class_x_board_and_year']")).sendKeys("cbsc2020");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@name='class_x_percentage_or_grade']")).sendKeys("A");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@name='class_x_subject[]']")).sendKeys("mathematics");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@name='class_x_total_marks[]']")).sendKeys("100");
		 Thread.sleep(1000);
		 */
		 driver.findElement(By.xpath("//input[@name='class_x_marks_obtained[]']")).sendKeys("85");
		 Thread.sleep(1000);
		 
		 
		 // Snehal changes below: 
		 
		 WebElement classxii = driver.findElement(By.xpath("//select[@class='form-control passed_class_xii']"));
		 Select cls = new Select(classxii);
		 cls.selectByValue("Passed");	
		 System.out.println("passed done"); // cross check
		 Thread.sleep(1000);
		 // chaged from "Passed" to "Appearing". 
		 // if you select "Passed", then you have out subject name & marks fields (at least once mandatory)
		 
		 cls.selectByValue("Appearing");
		 System.out.println("Appearing done"); //cross check
		 Thread.sleep(2000);
		// if you select "Appearing", then you have to put entrance exam details(No mandatory fields)
		 
		 // you have tick by maouse or keyboard so click()is used
		 // they will not select by default so isSelected() is not used. its only used for cross check if it is checked or not
		 driver.findElement(By.xpath("//input[@name='declaration']")).click();
		 boolean tick = driver.findElement(By.xpath("//input[@name='declaration']")).isSelected();
		 System.out.println("I agree clicked? = "+tick); // cross check
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 boolean finalsubmit = driver.findElement(By.xpath("//input[@name='declaration']")).isSelected();
		 System.out.println("Submit cliecked? = "+finalsubmit); // cross check
		 Thread.sleep(2000);
		 
		 driver.close();
	}
}

/* console output:
passed done
Appearing done
I agree clicked? = true
Submit cliecked? = false(due to not filled mandatory fields)
(after all mandatory fields done successfully, its will give true value, code is in right path)
 */
