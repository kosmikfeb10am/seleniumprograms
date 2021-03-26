package studentspractice;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertHandling2 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		
	driver=new ChromeDriver();
	
	driver.get("https://javascript.info/alert-prompt-confirm");
	
	driver.manage().window().maximize();
	
	
	
		
	}
	
	
	@AfterMethod
	public void teardown()
	{
		
	//	driver.quit();
	}
	
	
	
	@Test
	public void multipleWindowsTest() throws InterruptedException
	{
		
		
		driver.findElement(By.xpath("//span[text()=\"'How old are you?'\"]/preceding::div[1]/preceding-sibling::div/descendant::a")).click();
		
		
		Alert a1=driver.switchTo().alert();
		
		
		System.out.println(a1.getText());
		
		a1.sendKeys("55");
		
		a1.accept();
		
		Alert a2=driver.switchTo().alert();
		
		System.out.println(a2.getText());
		
		a2.accept();
		
		
		Thread.sleep(10000);
		
		
		
	}

}
