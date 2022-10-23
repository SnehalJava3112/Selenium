package com.aspire.waits;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// thread sleep--> this is not wait (stop the execution of the script for the specified duration of time,
// irrespective of whether the element is found or not on the web page)
public class Wait_Types 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Project\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
//1. thread sleep
		//Thread.sleep(10000);
				
//2. implicit wait	--> for single element	
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

//3. explicit wait --> for all elements
//		WebDriverWait ewait = new WebDriverWait(driver, null);
//    	ewait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Google']")));
    	
//4. fluent wait = rarely used 1 in 1000 companies	
    	
//search Flipkart word		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Flipkart");
		Thread.sleep(2000);
//Print all autosuggestions
		System.out.println("***All autosuggestion options****");
		List<WebElement> AutoSugestions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li/div/div[2]/div[1]/span"));
		for(WebElement option:AutoSugestions)
		{
			System.out.println(option.getText());
		}
		Thread.sleep(2000);
		driver.close();
	}
}


/*WebDriver driver = new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("Enter an URL");
WebElement DynamicElement = driver.findElement(By.id("DynamicElement"));



WebDriver driver = new FirefoxDriver();
 
driver.get("Enter an URL"S);
WebElement DynamicElement = 
   (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("DynamicElement")));
   
   
   */