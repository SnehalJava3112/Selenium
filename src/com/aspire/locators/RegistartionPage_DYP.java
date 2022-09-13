package com.aspire.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* link = http://www.dypatil.edu/application-form/
1.logo display status
2.get text --> school of admission
3.Form fillup geading text = PERSONAL DETAILS
4.school of admission
5.personal details
6.correspondence address
7.contact details --> 6 textboxes
8.academic details -->2 texboxes
9.subject details class X --> 2 subject, 3 fileds each
10.academic details of class XII
11.subject details class XII
12.enterance exam details
13.Declaration --> checkbox --> agree
14.submit application --> button
15.close
*/

public class RegistartionPage_DYP 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.dypatil.edu/application-form/");
		Thread.sleep(2000);
		
//1.xpath by attribute logo
		boolean logoStatus = driver.findElement(By.xpath("//img[@class='logo']")).isDisplayed();
		System.out.println("Logo display status = "+logoStatus);
		Thread.sleep(2000);

//2.xpath by text
		String schoolName = driver.findElement(By.xpath("//h1[text()='School of Admission']")).getText();
		System.out.println("School name text = "+schoolName);
		Thread.sleep(2000);
		
//3.xpath by contains (partial text)
		String detailsText = driver.findElement(By.xpath("//h1[contains(text(),'Persona')]")).getText();
		System.out.println("Form fillup geading text = "+detailsText);
		
		//String schoolName = driver.findElement(By.xpath("//h1[@class='section-heading']")).getText();
		Thread.sleep(2000);

//4.school of admission
		driver.findElement(By.xpath("//select[@name='school']")).click();
		driver.findElement(By.xpath("//option[@value='RAIT (School of Engineering )']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@id='level']")).click();
		driver.findElement(By.xpath("//option[@value='After 10+2']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@name='course_name']")).click();
		driver.findElement(By.xpath("//option[@value='B.Tech Lateral Entry in Computer Science and Business Systems Curriculum Designed by TCS']")).click();
		Thread.sleep(2000);	
 
//5.personal details
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Snehal");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='middle_name']")).sendKeys("Shailesh");
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("//input[@placeholder='Surname']")).sendKeys("Dharigouda");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Surname']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Surname']")).sendKeys("Patil");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='father_name']")).sendKeys("Suresh");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='mother_name']")).sendKeys("Anita");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='mother_tongue']")).sendKeys("Marathi");
		Thread.sleep(2000);
		
//gender --> radio button
		driver.findElement(By.xpath("(//input[@name='gender'])[2]")).click();
		
		boolean f_gender = driver.findElement(By.xpath("(//input[@name='gender'])[2]")).isSelected();
		boolean m_gender = driver.findElement(By.xpath("(//input[@name='gender'])[1]")).isSelected();
		
		System.out.println("Male option selected = "+m_gender);
		System.out.println("Female option selected = "+f_gender);
		Thread.sleep(2000);
		
//date of birth --> dropdown
		driver.findElement(By.xpath("//input[@placeholder='Date of Birth']")).sendKeys("02-Dec-2022");
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//input[@name='nationality']")).sendKeys("Indian");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='religion']")).sendKeys("Hindu");
		Thread.sleep(2000);
		
//category --> radio button
		driver.findElement(By.xpath("(//label[@class='radio radio-inline'])[4]")).click();
		boolean category = driver.findElement(By.xpath("(//label[@class='radio radio-inline'])[4]")).isSelected();
		System.out.println("Selected category = "+category);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='blood_group']")).sendKeys("A +ve");
		Thread.sleep(2000);
		
//6.correspondence address
 
		driver.findElement(By.xpath("//input[@placeholder='House No./Street']")).sendKeys("Gk Rose mansion");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Village/Town/Society']")).sendKeys("Punawale");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Post Office/City']")).sendKeys("Pune");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Pincode']")).sendKeys("411033");
		Thread.sleep(2000);
		
//country --> dropdown list
		driver.findElement(By.xpath("//select[@name ='address_country']")).click();
		driver.findElement(By.xpath("//option[@value='IN']")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//input[@placeholder='State']")).sendKeys("Maharashtra");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='District']")).sendKeys("Pune");
		Thread.sleep(2000);
		
// hostel required --> radio button
		driver.findElement(By.xpath("(//input[@name='hostel_required'])[2]")).click();
		Thread.sleep(2000);

//7.contact details
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("apple@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("012 3456 7890");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='fax']")).sendKeys("098 7654 3210");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("8600372380");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='father_mobile']")).sendKeys("123456");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='mother_mobile']")).sendKeys("987654");
		Thread.sleep(2000);

//8.academic details
		driver.findElement(By.xpath("//input[@name='class_x_board_and_year']")).sendKeys("SSC 2008");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='class_x_percentage_or_grade']")).sendKeys("90%");
		Thread.sleep(2000);
	
//9.subject details class X
//1
		driver.findElement(By.xpath("(//input[@name='class_x_subject[]'])[1]")).sendKeys("Mathematics");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='class_x_total_marks[]'])[1]")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='class_x_marks_obtained[]'])[1]")).sendKeys("94");
		Thread.sleep(2000);
//2
		driver.findElement(By.xpath("(//input[@name='class_x_subject[]'])[2]")).sendKeys("Science");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='class_x_total_marks[]'])[2]")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='class_x_marks_obtained[]'])[2]")).sendKeys("96");
		Thread.sleep(2000);

//10.academic details of class XII
		driver.findElement(By.xpath("//select[@name='passed_class_xii']")).click();
		driver.findElement(By.xpath("//option[@value='Passed']")).click();

//or 	driver.findElement(By.xpath("//option[@value='Appearing']")).click();
		Thread.sleep(2000);
		
// for passed selection		
		driver.findElement(By.xpath("//input[@name='class_xii_board_and_year']")).sendKeys("HSC 2010");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='class_xii_percentage_or_grade']")).sendKeys("85%");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='class_xii_stream']")).sendKeys("PCM");
		Thread.sleep(2000);
			
//11.subject details class XII
//1
		driver.findElement(By.xpath("(//input[@name='class_xii_subject[]'])[1]")).sendKeys("Physics");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='class_xii_total_marks[]'])[1]")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='class_xii_marks_obtained[]'])[1]")).sendKeys("80");
		Thread.sleep(2000);
//2
		driver.findElement(By.xpath("(//input[@name='class_xii_subject[]'])[2]")).sendKeys("Chemistry");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='class_xii_total_marks[]'])[2]")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='class_xii_marks_obtained[]'])[2]")).sendKeys("78");
		Thread.sleep(2000);
//3
		driver.findElement(By.xpath("(//input[@name='class_xii_subject[]'])[3]")).sendKeys("Mathematics");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='class_xii_total_marks[]'])[3]")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='class_xii_marks_obtained[]'])[3]")).sendKeys("82");
		Thread.sleep(2000);
		
//12.enterance exam details
		driver.findElement(By.xpath("//input[@placeholder='Name of Examination']")).sendKeys("AIEEE");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Year of Appearing']")).sendKeys("2010");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='other_exam_marks_obtained']")).sendKeys("70");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Percentile Obtained']")).sendKeys("70");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Rank Obtained']")).sendKeys("14570");
		Thread.sleep(2000);
		
//13.Declaration --> checkbox --> agree
		driver.findElement(By.xpath("//input[@name='declaration']")).click();
		Thread.sleep(2000);
		
//14.submit application --> button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
//15.close
		driver.close();
	}
}