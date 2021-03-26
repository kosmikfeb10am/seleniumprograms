package mar25th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButton2 {
	
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		
		driver=new ChromeDriver();
		
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown()
	{
		
		driver.quit();
	}
	
	@Test
	public void radioButtonTest() throws InterruptedException
	{
		
		
		boolean status=false;
		
		String attValue=driver.findElement(By.xpath("//input[@value='Cheese']")).getAttribute("checked");
		
		if(attValue.equals("true"))
		{
			status=true;
		}
		else
		{
			status=false;
		}
		Assert.assertTrue(status, "Not a default value");
		
		
		
		
		
		
		
		
		
		
	}

}
