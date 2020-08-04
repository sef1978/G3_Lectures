package week4_Synchronization_WaitConcepts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_28_ThreadSleepConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		// Thread Sleep;
		// is not part of Selenium == it is common method in Java
		// is used to slow down element or thread on a webPage
		// is static wait
		
		Thread.sleep(5000); // it is working at 4 seconds too, but recomendation is 5 seconds.
		
		System.out.println("title is : " + driver.getTitle());
		
		driver.close();

	}

}
// To use synchronizationsa is more professional way from Selenium instead of Thread.sleep.
// Thread.sleep doesn’t guarantee that it will work.
// If we use Thread.sleep(5000), we need to state that it would take longer than 5 seconds to load, 
// So that the script does not run, no assurances are provided for the element to appear
// within a fixed period to wait.