package Week2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Week1_SeleniumMethods.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_08_IDCOncept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// we can use ChromeOptions -> maximize parameter instead of fullscreen() 
		driver.manage().deleteAllCookies();
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		//ID is a locator in DOM or HTML. ID is unique element in HTML.
		
		// First Usage
//		WebElement userEl = driver.findElement(By.id("username"));
//		userEl.sendKeys("sef12@gmail.com");
//		WebElement userPass = driver.findElement(By.id("password"));
//		userPass.sendKeys("shf1234");
//		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
//		loginBtn.click();
		
		// second usage
//		driver.findElement(By.id("username")).sendKeys("sef12@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("shf1234");
//	    driver.findElement(By.id("loginBtn")).click();
		
		// Third usage
//	    By username = By.id("username");
//	    WebElement userEl = driver.findElement(username);
//	    userEl.sendKeys("sef12@gmail.com");
//	    By password = By.id("password");
//	    WebElement userpword = driver.findElement(password);
//	    userpword.sendKeys("sfh233");
//	    By loginBtn1 = By.id("password");
//	    WebElement lgnBtn = driver.findElement(loginBtn1);
//	    lgnBtn.sendKeys("sfh233");
		
	   
//	     WebElement.findElement() and driver.findElement() difference: 
//	     WebElement.findElement() checks a specific area
//	     driver.findElement() checks the whole webPage
//	     Fourth usage // BEST CHOICE TO USE
		
	    // Fourth usage
	    By usName = By.id("username");
	    By usPass = By.id("password");
	    By lBtn = By.id("password");
	    ElementUtil.getElement(driver, usName).sendKeys("sef12@gmail.com");
		ElementUtil.getElement(driver, usPass).sendKeys("shf1234");
		ElementUtil.getElement(driver, lBtn).click();
		
		driver.quit();
		
		// in real working life we are gonna use third and fifth usage.
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	}
}
