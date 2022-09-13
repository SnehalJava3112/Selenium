package com.aspire.iFrame;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// run one at a time, do not run whole code at same time	
// frame is used for advertisement block
public class Sample_Frame
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
	
		String text_para = driver.findElement(By.xpath("//div[contains(text(), 'Iframe page')]")).getText();
		System.out.println("Introduction text = "+text_para);
		Thread.sleep(2000);
			
//1. by index
//		driver.switchTo().frame(0);	//no index for webpage
//		System.out.println("Wepage frame index = 0");
//		Thread.sleep(2000);
		
//2. string name/id	
//		driver.switchTo().frame("frame1");	//frame1 is a name/id of the frame available in tag
//		System.out.println("Run by starting name/id");
//		Thread.sleep(2000);
		
//3. by webelement	
		// parent frame
		WebElement pframe = driver.findElement(By.xpath("//iframe[@width='500px']"));
		driver.switchTo().frame(pframe);
		String ptext = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		System.out.println("Parent frame text = "+ptext);
		Thread.sleep(2000);
		
		//child frame
		WebElement cframe = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(cframe);
		String ctext = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		System.out.println("Child frame Text = "+ctext);
		Thread.sleep(2000);
		
//child --> immediate parent frame
		driver.switchTo().parentFrame();
		System.out.println("Focus to Parent frame");
		Thread.sleep(2000);
		
//any child frame to --> homepage
		driver.switchTo().defaultContent();
		System.out.println("From any child to homepage");
		Thread.sleep(2000);
		
//Goto 'Elemenet' tab
		driver.findElement(By.xpath("//*[text()='Elements']")).click();
		Thread.sleep(2000);
		
		driver.close();
	}
}