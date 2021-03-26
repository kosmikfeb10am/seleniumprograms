package mar25th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBox2 {
	
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		
		driver=new ChromeDriver();
		
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		
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
		
		
		List<WebElement> checkBoxes=driver.findElements(By.xpath("//td[@class='table5']/input"));
		
		for(WebElement check:checkBoxes)
		{
			
			if(!check.isSelected())
			{
				check.click();
				
				Thread.sleep(5000);
			}
		}
		
		
		
		
		
		for(WebElement check:checkBoxes)
		{
			
			System.out.println(check.getAttribute("value")+"------"+check.getAttribute("checked"));
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
