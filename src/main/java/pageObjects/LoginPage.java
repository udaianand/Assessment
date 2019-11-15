/**
 * 
 */
package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Udaianand
 *
 */
public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "userName")
	private WebElement userName;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(name = "login")
	private WebElement login_btn;

	public void enterUserName(String userName) {
		this.userName.sendKeys(userName);
	}

	public void enterPassword(String password) {
		this.password.sendKeys(password);
	}

	public void loginApp() {
		login_btn.click();
	}

}
