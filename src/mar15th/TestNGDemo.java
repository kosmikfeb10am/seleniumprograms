package mar15th;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	@AfterMethod
	public void tearDown()
	{
	    
		System.out.println("Browser closed ..");
	}
	
	@Test(priority=2)
	public void loginTest()
	{
		Assert.assertTrue(false);
		
		System.out.println("Login successfull..");
		
		
	}
	
	@Test(priority=1)
	public void registrationTest()
	{
		
		System.out.println("Registration successfull..");
		
		
	}
	
	@Test(priority=3,dependsOnMethods="loginTest")
	public void changePasswordTest()
	{
		
		System.out.println("Chnage password successfull..");
		
		
	}
	
	@BeforeMethod
	public void setUp()
	{
		
		

		System.out.println("Browser started ...");
		System.out.println("App Launched ..");
	}


}
