package studentspractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownTestingSpiceJet {

	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/default.aspx");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
		
		driver.findElement(By.xpath("//ul/li/a[starts-with(normalize-space(.),'Kozhikode')]")).click();
		
		Thread.sleep(10000);
		
		driver.quit();
		

	}

}
