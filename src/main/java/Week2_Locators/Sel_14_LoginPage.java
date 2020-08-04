package Week2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Week1_SeleniumMethods.ElementUtil;

public class Sel_14_LoginPage {

	    public static WebDriver driver;
		static By email = By.id("username");
		static By password = By.xpath("//input[@id='password']");
		static By loginBtn = By.cssSelector("#loginBtn");

	public static void main(String[] args) throws InterruptedException {
			
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, "https://app.hubspot.com/login");
		Thread.sleep(5000);
			
		ElementUtil.getElement(driver, email).sendKeys("shf23@hotmail.com");
		Thread.sleep(2000);
		ElementUtil.getElement(driver, password).sendKeys("sh43536");
		Thread.sleep(2000);
		ElementUtil.getElement(driver, loginBtn).click();
		Thread.sleep(2000);
		ElementUtil.quitBrowser(driver);
		
			
			
			
	}

}
