package week5_JavaScriptExecuter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_44_HeadlessFirefox {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxOptions co = new FirefoxOptions();
		co.addArguments("--headless"); // we have to write --headless as an argument for chromeoptions
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://siliconelabs.com");
		
		System.out.println(driver.getTitle());

		
		
	}

}
