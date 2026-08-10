package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login2")
	private WebElement loginLink;

	@FindBy(id="loginusername")
	private WebElement usernameBox;

	@FindBy(id="loginpassword")
	private WebElement passwordBox;

	@FindBy(xpath="//button[text()='Log in']")
	private WebElement loginBtn;

	@FindBy(id="nameofuse")
	private WebElement loggedUser;
	
	
	public void openApplication(String url) {
		driver.get(url);
	}
	
	public void clickLoginLink() {
		loginLink.click();
	}

	public void enterCredentials(String username, String password) {
		usernameBox.sendKeys(username);
		passwordBox.sendKeys(password);
	}

	public void clickLoginButton() {
		loginBtn.click();
	}
	
	public String verifyLoggedInUser() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return loggedUser.getText();
	}
}
