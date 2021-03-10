package studentspractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownTestingAdactin {

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("username")).sendKeys("reyaz009");
		
		driver.findElement(By.id("password")).sendKeys("reyaz123");
		
		driver.findElement(By.id("login")).click();
		
		WebElement dropDown=driver.findElement(By.id("location"));
		
		List<WebElement> itemsInDropDown=dropDown.findElements(By.tagName("option"));
		
		System.out.println("Items in Dropdown "+itemsInDropDown.size());
		
		for(int i=0;i<itemsInDropDown.size();i++)
		{
			
			System.out.println(itemsInDropDown.get(i).getText());
		}
		
		driver.quit();
		

	}

}
