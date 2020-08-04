package Week1_SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_02_WebDriverBasicsWithFirefox {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/sefikaarslan/Documents/DRIVERS/geckodriver");

		WebDriver driver = new FirefoxDriver();

		// Launch Browser
		driver.get("https://siliconelabs.com/"); // we can also write http instead https, it still works.
													
		// Get title
		String title = driver.getTitle();
		System.out.println(title);

		// Verify the title
		if (title.equals("Homepage - SiliconeLabs")) {
			System.out.println("Correct title");
		} else {
			System.out.println("Incorrect title");
		}
		String URL = driver.getCurrentUrl();
		System.out.println("Current URL : " + URL);

		driver.close();
		driver.quit();

	}

}
