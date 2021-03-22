package mar19th;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertHandling {
	
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		
		driver=new ChromeDriver();
		
		driver.get("https://www.angelfire.com/super/badwebs/");
		
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown()
	{
		
		driver.quit();
	}
	
	@Test
	public void multipleWindowHandlingTest() throws InterruptedException
	{
		
		driver.switchTo().frame("contents");
		
		driver.findElement(By.xpath("(//font[contains(text(),'I Hate Frames')])[1]/parent::a")).click();
		
		
		
		Thread.sleep(10000);
		
		
	}
		
		

}
