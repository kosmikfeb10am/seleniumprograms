package mar25th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButton {
	
	
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
		
		
		List<WebElement> radioButtons=driver.findElements(By.xpath("//input[@name='group1']"));
		
		
		
		for(WebElement radio:radioButtons)
		{
			
			System.out.println(radio.getAttribute("value")+"------"+radio.getAttribute("checked"));
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
