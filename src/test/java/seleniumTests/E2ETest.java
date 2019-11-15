/**
 * 
 */
package seleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Udaianand
 *
 */
public class E2ETest {

	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Aanand\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

		driver.get("http://newtours.demoaut.com/index.php");

		String loginPageTitle = driver.getTitle();
		System.out.println(loginPageTitle); // Welcome: Mercury Tours

		driver.findElement(By.name("userName")).sendKeys("udaytest695@gmail.com");
		driver.findElement(By.name("password")).sendKeys("test123");
		driver.findElement(By.name("login")).click();

		String HomePageTitle = driver.getTitle();
		System.out.println(HomePageTitle); // Find a Flight: Mercury Tours:

		// Make Entry for 2 passenger:

		Select passengerCount = new Select(driver.findElement(By.name("passCount")));
		passengerCount.selectByValue("2");

		Select departFrom = new Select(driver.findElement(By.name("fromPort")));
		departFrom.selectByValue("London");

		driver.findElement(By.name("findFlights")).click();

		String flightResultsPageTitle = driver.getTitle();
		System.out.println(flightResultsPageTitle); // Find a Flight: Mercury Tours:

		// driver.quit();

	}

}
