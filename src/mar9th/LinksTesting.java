package mar9th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("//div[text()='Get to Know Us']/parent::div"));
		
		List<WebElement> blockLinks=block.findElements(By.tagName("a"));
		
		for(int i=0;i<blockLinks.size();i++)
		{
			
			block=driver.findElement(By.xpath("//div[text()='Get to Know Us']/parent::div"));
			
			blockLinks=block.findElements(By.tagName("a"));
			
			String linkName=blockLinks.get(i).getText();
			
			System.out.println("linkName "+linkName);
			
			String expURL=blockLinks.get(i).getAttribute("href");
			
			System.out.println("expURL "+expURL);
			
			blockLinks.get(i).click();
			
			Thread.sleep(3000);
			
			String actUrl=driver.getCurrentUrl();
			
			System.out.println("actUrl"+actUrl);
			
			driver.navigate().back();
			
			Thread.sleep(3000);
			
			
			
			
		}
		
		
		driver.quit();
		
		
		
		
		
		

	}

}
