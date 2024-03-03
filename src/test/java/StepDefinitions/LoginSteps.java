package StepDefinitions;

import io.cucumber.java.en.Given;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Resources.Base;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageObjects.AccountsPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import io.cucumber.java.en.Then;

public class LoginSteps extends Base {

	WebDriver driver;
	LandingPage landingPage;
	LoginPage loginPage;
	AccountsPage accountsPage;

	@Given("^open any Browser$")
	public void open_any_browser() throws IOException {
		driver = initilizeDriver();

	}

	@And("^Navigate to login Page$")
	public void navigate_to_login_page() throws InterruptedException {
		driver.get(prop.getProperty("url"));
		landingPage = new LandingPage(driver);
		landingPage.myAccountDropdown().click();
		landingPage.loginOption().click();
		Thread.sleep(3000);

	}

	@When("User enters username as {string} and password as {string} into the fields")
	public void user_enters_username_as_and_password_as_into_the_fields(String email, String password) {
		loginPage = new LoginPage(driver);
		loginPage.emailAddressField().sendKeys(email);
		loginPage.passwordField().sendKeys(password);

	}

	@And("^User click on Login Button$")
	public void user_click_on_login_button() {
		loginPage.loginField().click();
	}

	@Then("^Verify user is able to successfully login$")
	public void verify_user_is_able_to_successfully_login() {
		accountsPage = new AccountsPage(driver);
		Assert.assertTrue(accountsPage.editAccountInformationOption().isDisplayed());

	}
	
	@After
	public void tearDown()
	{
		driver.close();
	}
}
