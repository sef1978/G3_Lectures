package week4_Synchronization_WaitConcepts;
import java.time.Duration;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_34_FluentWaitConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
				
		driver.findElement(By.xpath("//button[contains(text(), 'Click Me - Fluent Wait')]")).click();
		
		// we use Fluent wait for unpredictible times for the element locator
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5)) // if we use 0 second it is default time 
						.ignoring(NoSuchMethodException.class);
		// if we use 0 second it is being default time == // 500 miliseconds == half second 
		
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver){
				WebElement element = driver.findElement(By.id("demo"));
				String getTextPage = element.getText();
				if (getTextPage.equals("Software Testing Material - DEMO PAGE")) {
					System.out.println("text : " + getTextPage);
					return element;
				}else {
					System.out.println("text is wrong");
				}
				return null;
			}
		});
		
		driver.quit();
		
	}
	
	// differences between Explicit and Fluent waits.
	// Explicit wait ; we can define different times for the each element. 
	// Fluent wait ; we can define the time for the elements and assign pollingEvery concept and we can check the locators on every specified time. 

}
