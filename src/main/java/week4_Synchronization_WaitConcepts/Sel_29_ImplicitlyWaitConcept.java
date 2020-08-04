package week4_Synchronization_WaitConcepts;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_29_ImplicitlyWaitConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.get("https://app.hubspot.com/login");

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		System.out.println("title is : " + driver.getTitle());
		
		// This wait tells webdriver to wait if the element is not available immediately
		// and webdriver waits till the element is visible in specific time.
		// it will throw NoSuchELementException
		// implicitly wait can be used only for elements == not NON-ELEMENTS
		// imp wait is static tw we will use explicit and fluent wait instead because they are dynamic.
		
	
		driver.close();
	}

}
