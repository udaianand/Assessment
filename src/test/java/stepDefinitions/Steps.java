/**
 * 
 */
package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.LoginPage;

/**
 * @author Udaianand
 *
 */
public class Steps {
	WebDriver driver;
	LoginPage loginPage;

	PageObjectManager pageObjectManager;
	WebDriverManager webDriverManager;

	@Given("^user is on login page$")
	public void user_is_on_login_page() {

		webDriverManager = new WebDriverManager();
		System.setProperty(webDriverManager.getChromeDriverProperty(),
				FileReaderManager.getInstance().getConfigReader().getDriverPath());

		// driver = new ChromeDriver();
		driver = webDriverManager.getDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(),
				TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(
				FileReaderManager.getInstance().getConfigReader().getPageLoadTimeout(), TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/index.php");

	}

	@When("^title of login page is MercuryTours$")
	public void title_of_login_page_is_MercuryTours() {
		String loginPageTitle = driver.getTitle();
		System.out.println("Page title before login:: " + loginPageTitle);
	}

	@Then("^user enter username and password$")
	public void user_enter_username_and_password() {
		pageObjectManager = new PageObjectManager(driver);
		loginPage = pageObjectManager.getLoginPage();
		loginPage.enterUserName("udaytest695@gmail.com");
		loginPage.enterPassword("test123");

	}

	@Then("^user logins$")
	public void user_logins() throws Throwable {
		loginPage.loginApp();
	}

	@Then("^user is on homepage$")
	public void user_is_on_homepage() {
		String homePageTitle = driver.getTitle();
		System.out.println("HomePage title after login:: " + homePageTitle);
	}

	@Then("^user exits application$")
	public void user_exits_application() {
		System.out.println("Exit from the App");
		webDriverManager.quitDriver();
		// driver.quit();
	}

}
