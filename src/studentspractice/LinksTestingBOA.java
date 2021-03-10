package studentspractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTestingBOA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.bankofamerica.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("No of Links "+allLinks.size());
		int countOfHiddenLinks=0;
		int countOfVisibleLinks=0;
		
		for(int i=0;i<allLinks.size();i++)
		{
			
			if(allLinks.get(i).getText().isEmpty())
			{
				
				countOfHiddenLinks++;
			}
			
			else
			{
				countOfVisibleLinks++;
				System.out.println(allLinks.get(i).getText());
			}
			
		}
		
		
		System.out.println("countOfHiddenLinks"+countOfHiddenLinks);
		System.out.println("countOfVisibleLinks"+countOfVisibleLinks);
		
		driver.quit();

	}

}
