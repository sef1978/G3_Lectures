package week5_JavaScriptExecuter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_43_HeadlessChromeBrowser {

	public static void main(String[] args) {
	
		// we can execute our testcase without a browser.
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless"); 
		// we have to write --headless keyword as an argument for chromeoptions
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://siliconelabs.com");
		
		System.out.println(driver.getTitle());
		
	
		
		
	}

}
