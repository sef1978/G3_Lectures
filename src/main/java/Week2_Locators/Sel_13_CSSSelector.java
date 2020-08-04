package Week2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Week1_SeleniumMethods.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_13_CSSSelector {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen(); // yazabiliriz bunu da.
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(4000);
		
		By username = By.cssSelector("#username");
		ElementUtil.getElement(driver, username).sendKeys("sfa@gmail.com");
		
		By pword = By.cssSelector("#password");
		ElementUtil.getElement(driver, pword).sendKeys("shf3244");
		
		By loginBtn = By.cssSelector("#loginBtn");
		ElementUtil.getElement(driver, loginBtn).click();
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
