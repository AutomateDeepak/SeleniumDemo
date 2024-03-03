package Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Resources.Base;

public class ThreeTest extends Base {
	
	public WebDriver driver;

	@Test
	public void testThree() throws IOException, InterruptedException {
		System.out.println("Inside test three");

	driver	 = initilizeDriver();

		driver.get("https://tutorialsninja.com/demo/");

		Thread.sleep(3000);

		driver.close();
	}

}
