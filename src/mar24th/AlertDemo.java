package mar24th;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertDemo {
	
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		
		driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown()
	{
		
		driver.quit();
	}
	
	@Test
	public void alertDemoTest() throws InterruptedException
	{
		
		
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("kosmik");
		
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		
		Alert al=driver.switchTo().alert();
		
		System.out.println(al.getText());
		
		Assert.assertEquals(al.getText(), "Please enter your password","Other Alter message is poped up ..please check");
		
		al.accept();
		
		Thread.sleep(10000);
		
		
		
	}

}
