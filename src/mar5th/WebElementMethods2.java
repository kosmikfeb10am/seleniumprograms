package mar5th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		
		String expURL=driver.findElement(By.linkText("New User Register Here")).getAttribute("href");
		
		
		System.out.println(expURL);
		
		driver.findElement(By.linkText("New User Register Here")).click();
		
		String actURL=driver.getCurrentUrl();
		
		System.out.println(actURL);
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
