package week4_Synchronization_WaitConcepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait; // we need to import first
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_30_ExplicitlyWaitConcept {

	public static WebDriverWait wait;
	public static String title;
	
	public static void main(String[] args) {
		
		// Explicit wait;
		   // works with webElement and non-element
		   // waits available in webDriverWait class
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		// non-element usage
		WebDriverWait wait = new WebDriverWait(driver, 15);
//		wait.until(ExpectedConditions.titleContains("Hubspot Login")); 
		// title is non-element. we can also get the text partially.it still works.
		
		// if we dont use whole title name, no prblm, even only Hubspot can be found too.
//		wait.until(ExpectedConditions.titleContains("hubspot Login"));	
		// if we use wrong name it gives org.openqa.selenium.TimeoutException
		
	    // element usage -> for one element
		   // we can only use for a specific element which has a problem, not for all elements.
		By email = By.id("username");
		// we use explicit wait before the specific locator
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(email)); // explicit wait
		WebElement username = driver.findElement(email); // locator
		username.sendKeys("sefArs@gmail.com");
		
		System.out.println("title is : " + driver.getTitle());
		
		driver.close();
		
	}
	
	
	/**
	 * presence of element located
	 * @param locator
	 * @return
	 */
	public boolean waitForTitlePresent(By locator){
		wait.until(ExpectedConditions.titleIs(title));
		return true;
	}
	
	
	/**
	 * visibility of element located
	 * @param locator
	 * @return
	 */
	public boolean waitForElementPresent(By locator){
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		return true;
	}

}
// The NoSuchElementException is thrown when the element you are attempting to 
// find is not in the DOM. This can happen for three reasons:
 // 1 your locator might be incorrect
 // 2 your timing might be incorrect
 // 3 There is no element in the html
 