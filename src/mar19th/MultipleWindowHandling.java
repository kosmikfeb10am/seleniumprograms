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

public class MultipleWindowHandling {
	
	
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
			catch(NoSuchElementException e)
			{
				
				System.out.println("NoSuchElementException found in this window");
			}
			
		}
		
		Thread.sleep(30000);
		
		
	}
		
		

}
