package mar9th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownTesting2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement dropDown=driver.findElement(By.id("searchDropdownBox"));
		
		List<WebElement> itemsInDropDown=dropDown.findElements(By.tagName("option"));
		
		System.out.println("No of items in Dropdown "+itemsInDropDown.size());
		
		
		for(int i=0;i<itemsInDropDown.size();i++)
		{
			
			System.out.println(itemsInDropDown.get(i).getText());
		}
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
