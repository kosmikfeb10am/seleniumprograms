package studentspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTestingFacebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@role='button' and @data-testid='open-registration-form-button']")).click();
		
		Thread.sleep(5000);
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("2");
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("Oct");
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("2000");
		
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
