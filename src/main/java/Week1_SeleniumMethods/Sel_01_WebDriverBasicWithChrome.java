package Week1_SeleniumMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_01_WebDriverBasicWithChrome {

	public static void main(String[] args) {
		
		// Set Property
		System.setProperty("webdriver.chrome.driver", "/Users/sefikaarslan/Documents/DRIVERS/chromedriver");
		// we can get the value from terminal dropping by the driver.
		// "main" java.lang.IllegalStateException if there is an error in the statement
		// Set Browser
		WebDriver driver = new ChromeDriver();
		
		// Launch Browser
		driver.get("https://siliconelabs.com/"); // we can also write http instead https, it still works.
		
		// Get title
		String title = driver.getTitle();
		System.out.println(title);
		
		// Verify the title
		if (title.equals("Homepage - SiliconeLabs")) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("Incorrect title");
		}
		String URL = driver.getCurrentUrl();
		System.out.println("Current URL : " + URL);
		
		
		driver.close();
		driver.quit();
	}

}
