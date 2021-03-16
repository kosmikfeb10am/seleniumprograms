package mar16th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseHover {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		
		driver=new ChromeDriver();
		
		driver.get("https://www.stepchange.org/");
		
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown()
	{
		
		driver.quit();
	}
	
	@Test
	public void mouseHoverTest() throws InterruptedException
	{
		
		Actions action=new Actions(driver);
		
		/*
		 * action .moveToElement(driver .findElement(By
		 * .xpath("//a[text()='How we help']"))) .perform();
		 * 
		 * Thread.sleep(5000);
		 * 
		 * driver.findElement(By.xpath("//a[text()='Money advice']")).click();
		 */
		
		action
		.moveToElement(driver .findElement(By.xpath("//a[text()='How we help']")))
		.pause(5000)
		.moveToElement(driver.findElement(By.xpath("//a[text()='Money advice']")))
		.click()
		.build()
		.perform();
		
		Thread.sleep(5000);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
