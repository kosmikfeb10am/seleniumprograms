package studentspractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTestingMyntra {
	
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		
		List<WebElement> allLinks=driver.findElements(By.xpath("//div/descendant::a[@data-type]"));
		
		System.out.println("No of Links "+allLinks.size());
		
		
		
		for(int i=0;i<allLinks.size();i++)
		{
			
			System.out.println(allLinks.get(i).getText());
			
			System.out.println(allLinks.get(i).getAttribute("href"));
			
			allLinks.get(i).click();
			
			
			driver.navigate().back();
			
			allLinks=driver.findElements(By.xpath("//div/descendant::a[@data-type]"));
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
