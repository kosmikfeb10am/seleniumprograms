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

public class MultipleWindowHandling2 {
	
	
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
		
		System.out.println(homeWindowId);
		
		driver.findElement(By.xpath("//img[contains(@src,'google-play')]/parent::a")).click();
		
		Set<String> windowIds=driver.getWindowHandles();
		
		System.out.println(windowIds);
		
		Iterator<String> it=windowIds.iterator();
		
		
	}
		
		

}
