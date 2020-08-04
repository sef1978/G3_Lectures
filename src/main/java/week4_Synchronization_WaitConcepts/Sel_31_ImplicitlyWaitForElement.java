package week4_Synchronization_WaitConcepts;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_31_ImplicitlyWaitForElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// imp wait will be applied for all the web elements by default
		// which is called global wait level.it means it is valid for all elements.
		
		driver.get("https://app.hubspot.com/login");
		
//		Thread.sleep(5000);
		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   // nullify imp wait
		
		driver.findElement(By.id("username")).sendKeys("shefA@gmail.com");
				
		driver.close();

		
	}

}
