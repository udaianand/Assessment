/**
 * 
 */
package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Udaianand
 *
 */
public class HomePage {

	/**
	 * @param driver
	 */
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
