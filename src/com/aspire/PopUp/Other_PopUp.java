package com.aspire.PopUp;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//1. Alert box click--> close PopUp window
//2. Confirm box click --> gettext of box --> select proper conditions
//3. Prompt box click --> gettext of box --> select proper conditions

public class Other_PopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		Thread.sleep(2000);
		
//1. Alert box click--> close PopUp window		
		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		System.out.println("Alert box text = "+alt.getText());
		alt.accept();
		Thread.sleep(2000);

//2. Confirm box click --> gettext of box --> select proper conditions
		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
		Thread.sleep(2000);
		Alert cnfalt = driver.switchTo().alert();
		System.out.println("Confirm box text = "+cnfalt.getText());
		cnfalt.accept();
		//cnfalt.dismiss();	// choose one at a time
		Thread.sleep(2000);
		
//3. Prompt box click --> gettext of box --> select proper conditions
		driver.findElement(By.xpath("//button[@id='promptBox']")).click();
		Thread.sleep(2000);
		Alert prmtbox = driver.switchTo().alert();
		System.out.println("Prompt box text = "+prmtbox.getText());
		prmtbox.accept();
		//prmtbox.dismiss();	//choose one at a time
		Thread.sleep(2000);
		
		driver.close();
	}
}
/* Output :
Alert box text = This is a simple alert box! 
You can't escape from me until you click 'OK'!
Confirm box text = Click 'OK' or 'Cancel'.
Prompt box text = Which Selenium Tool do you like the most?
*/