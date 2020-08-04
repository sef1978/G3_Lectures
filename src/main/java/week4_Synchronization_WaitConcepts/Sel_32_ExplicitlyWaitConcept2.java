package week4_Synchronization_WaitConcepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_32_ExplicitlyWaitConcept2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");

		
		By email = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");
		
		getElement(driver, email).sendKeys("feyzam@sample.com");;
		getElement(driver, password).sendKeys("ddjg453");
		getElement(driver, loginBtn).click();
		
		driver.close();
		
	}
	
	
	/**
	 * to add wait concept while getting element from the page
 	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver, By locator){
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		
		WebElement element = driver.findElement(locator);
		return element;
	}

}
