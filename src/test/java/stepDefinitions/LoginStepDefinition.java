package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.LoginPage;
import util.BaseClass;

public class LoginStepDefinition extends BaseClass {
	
	LoginPage loginPage;
	
	@Given("user open the application {string}")
	public void user_open_the_application(String url) {
		loginPage = new LoginPage(driver);   //Driver initialize from Hooks/BaseClass using Hooks [Before, After] initialize the driver instance
		loginPage.openApplication(url);
	}
	
	@When("user click login link")
	public void user_click_login_link() {
		loginPage.clickLoginLink();
	}
	
	@When("user enter username as {string} and password as {string}")
	public void user_enter_username_as_and_password_as(String username, String password) {
		System.out.println("Use enter credentials");
		loginPage.enterCredentials(username, password);
	}
	
	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
		System.out.println("Use clicks login button");
		loginPage.clickLoginButton();
	}
	
	@Then("verify the logged in user as {string}")
	public void verify_the_logged_in_user_as(String loggedUser) {
	    String loggedTxt = loginPage.verifyLoggedInUser();
	    System.out.println("Logged in user : " + loggedTxt);
	    System.out.println(loggedTxt.contains(loggedUser));
	    Assert.assertTrue(loggedTxt.contains(loggedUser));
	}
}
