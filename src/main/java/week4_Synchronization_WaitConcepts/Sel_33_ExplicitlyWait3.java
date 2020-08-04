package week4_Synchronization_WaitConcepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_33_ExplicitlyWait3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.titleContains("Hubspot Login"));
		
//		System.out.println("title is : " + driver.getTitle());

		By email = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");
		
		getElement(driver, email, 5).sendKeys("sefika@sample.com"); // timeout is flexible for each element.
		getElement(driver, password, 1).sendKeys("test3435");
		getElement(driver, loginBtn, 2).click();
		// this is black box testing.
		// black box testing is changing the time until it works.. starting from 0 second.
		driver.quit();
		
	}

	
	/**
	 * getting the element with wait concept
	 * @param driver
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public static WebElement getElement(WebDriver driver, By locator, int timeout){
		waitForPresenceOfElement(driver, locator, timeout); // flexible explicitly wait for each element
		WebElement element = driver.findElement(locator);
		return element;
	}
	
	
	/**
	 * adding wait concept before the locator
	 * @param driver
	 * @param locator
	 * @param timeout
	 */
	public static void waitForPresenceOfElement(WebDriver driver, By locator, int timeout){
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator)); // flexible explicitly wait for each element
	}
	
	
}
