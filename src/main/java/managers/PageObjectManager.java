/**
 * 
 */
package managers;

import org.openqa.selenium.WebDriver;

import dataProviders.ConfigFileReader;
import pageObjects.HomePage;
import pageObjects.LoginPage;

/**
 * @author Udaianand
 *
 */
public class PageObjectManager {

	private WebDriver driver;

	private LoginPage loginPage;
	private HomePage homePage;
	private ConfigFileReader configFileReader;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;

	}

	public ConfigFileReader getConfigFileReader() {

		return (configFileReader == null) ? configFileReader = new ConfigFileReader() : configFileReader;

	}

	public LoginPage getLoginPage() {

		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;

	}

	public HomePage getHomePage() {

		return (homePage == null) ? homePage = new HomePage(driver) : homePage;

	}
}
