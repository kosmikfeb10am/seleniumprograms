package mar5th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		
		WebElement e1=driver.findElement(By.linkText("New User Register Here"));
		
		System.out.println(e1.getCssValue("font-family"));
		
		System.out.println(e1.getCssValue("color"));
		
		System.out.println(e1.getTagName());
		
		System.out.println(driver.findElement(By.className("build_title")).getText());
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
