package Tests;

import org.testng.annotations.Test;

import Resources.Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class TwoTest extends Base {
	public WebDriver driver;

	@Test
	public void testTwo() throws InterruptedException, IOException {
		System.out.println("Inside test two");

		driver = initilizeDriver();

		driver.get("https://tutorialsninja.com/demo/");

		Thread.sleep(3000);

		driver.close();

	}

}
