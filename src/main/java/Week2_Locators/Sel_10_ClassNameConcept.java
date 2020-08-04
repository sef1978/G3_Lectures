package Week2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Week1_SeleniumMethods.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_10_ClassNameConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// we can use ChromeOptions->maximize parameter instead of fullscreen() 
		driver.manage().deleteAllCookies();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);

		// form-control private-form__control login-email
		By username = By.className("login-email");
		ElementUtil.getElement(driver, username).sendKeys("shf12@hotmail.com");
		
		
	}

}
