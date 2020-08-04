package week5_JavaScriptExecuter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_42_LaunchBrowser {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
//		String browser = "chrome";

		String browser = "firefox";
		
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if (browser.equals("opera")) {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		}else if (browser.equals("IE")) {
			WebDriverManager.operadriver().setup();
			driver = new InternetExplorerDriver();
		}else if(browser.equalsIgnoreCase("safari")){
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver = new SafariDriver();
		}
		else {
			System.out.println("no defined browser");
		}
		
		driver.get("https://ww.amazon.com");

	}

}
