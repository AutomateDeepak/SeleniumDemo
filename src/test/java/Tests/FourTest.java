package Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Resources.Base;

public class FourTest extends Base {

	public WebDriver driver;
	@Test
	public void testFour() throws IOException, InterruptedException {
		System.out.println("Inside test four");

		driver = initilizeDriver();

		driver.get("https://tutorialsninja.com/demo/");

		Thread.sleep(3000);
		
		Assert.assertTrue(false);

		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	   
}
