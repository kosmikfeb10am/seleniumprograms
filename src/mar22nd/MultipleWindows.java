package mar22nd;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindows {
	
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		
		driver=new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
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
		
		String homeWindowId=driver.getWindowHandle();
		
		
		driver.findElement(By.xpath("//img[contains(@src,'google-play')]/parent::a")).click();
		
		
		Set<String> windowIds=driver.getWindowHandles();
		
		Iterator<String> it=windowIds.iterator();
		
		while(it.hasNext())
		{
			
			driver.switchTo().window(it.next());
			
			try
			{
			driver.findElement(By.xpath("//a[text()='See more']")).click();
			break;
			}
			catch(Exception e)
			{
				System.out.println("Not Switched to expected Window");
			}
			
			
			
		}
		
		driver.switchTo().window(homeWindowId);
		
		driver.findElement(By.xpath("//img[contains(@src,'ios-button')]/parent::a")).click();
		
		windowIds=driver.getWindowHandles();
		
		it=windowIds.iterator();
		
		while(it.hasNext())
		{
			
			driver.switchTo().window(it.next());
			
			try
			{
			driver.findElement(By.xpath("//a[text()='Terms of Service']")).click();
			break;
			}
			catch(Exception e)
			{
				System.out.println("Not Switched to expected Window");
			}
			
			
			
		}
		
		
		
		Thread.sleep(10000);
		
		
		
		
	}

}
