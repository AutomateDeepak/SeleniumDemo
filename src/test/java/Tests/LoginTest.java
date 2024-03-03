package Tests;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Resources.Base;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.AccountsPage;

public class LoginTest extends Base {

	public WebDriver driver;

	@Test(dataProvider = "getLoginData")
	public void login(String email, String password, String expectedResult) throws IOException, InterruptedException {

		LandingPage landingPage = new LandingPage(driver);
		landingPage.myAccountDropdown().click();
		landingPage.loginOption().click();
		
		Thread.sleep(4000);

		LoginPage loginPage = new LoginPage(driver);
		loginPage.emailAddressField().sendKeys(email);
		loginPage.passwordField().sendKeys(password);
		loginPage.loginField().click();

		Thread.sleep(4000);
		AccountsPage accountsPage = new AccountsPage(driver);

		String actualResult = null;
		try {
			if (accountsPage.editAccountInformationOption().isDisplayed())

				actualResult = "success";

		} catch (Exception e) {
			actualResult = "Unscuccessful";
		}

		Assert.assertEquals(actualResult, expectedResult);

	}

	@BeforeMethod
	public void openApplication() throws IOException {
		driver = initilizeDriver();
		driver.get(prop.getProperty("url"));
	}

	@AfterMethod
	public void closure() {
		driver.close();
	}

	@DataProvider
	public Object[][] getLoginData() {
		Object[][] data = { {"arun@gmail.com", "123456", "Unscuccessful"},
				{"deep123@gmail.com", "test123", "success"} };

		return data;
	}
}
