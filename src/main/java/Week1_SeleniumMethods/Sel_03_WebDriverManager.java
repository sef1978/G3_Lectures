package Week1_SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_03_WebDriverManager {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://learnsdet.com");
		
//		WebDriverManager.geckodriver().setup();
//		WebDriver driver = new FirefoxDriver();
		
		WebDriverManager.chromedriver().browserPath(null).setup();
		
		
	}

}
