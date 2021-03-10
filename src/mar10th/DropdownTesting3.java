package mar10th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTesting3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		/*
		 * WebElement dropDown=driver.findElement(By.id("searchDropdownBox"));
		 * 
		 * Select s=new Select(dropDown);
		 * 
		 * s.selectByIndex(6);
		 */
		
		
		//new Select(driver.findElement(By.id("searchDropdownBox"))).selectByIndex(6);
		
		
		/*
		 * new Select(driver .findElement(By .id("searchDropdownBox")))
		 * .selectByValue("search-alias=stripbooks");
		 */
		
		new Select(driver
				.findElement(By
						.id("searchDropdownBox"))).selectByVisibleText("Watches");
		
		Thread.sleep(5000);
		
		
		driver.quit();
		
		
		
	}

}
