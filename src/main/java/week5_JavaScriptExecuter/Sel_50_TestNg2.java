package week5_JavaScriptExecuter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sel_50_TestNg2 {

	public static WebDriver driver;
	ElementUtil elementUtil;
	// locators
	By email = By.id("username");
	By password = By.id("password");
	By loginBtn = By.id("loginBtn");
	By bodyText = By.xpath("//div[@class='private-alert__inner']/h5");
 	
	
	@BeforeMethod
	public void setUp() throws InterruptedException{
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, "https://app.hubspot.com/login");
		Thread.sleep(5000);
	
	}
	
	
	@Test(priority = 1, description="invalid username and password for Login Page")
	public void invalidCredentials(){
		ElementUtil.getElement(driver, email).sendKeys("SA@sample.com");;
		ElementUtil.getElement(driver, password).sendKeys("test463");
		ElementUtil.clickOn(driver, loginBtn);
		String text = ElementUtil.getElement(driver, bodyText).getText();
		System.out.println(text);
		Assert.assertEquals(text, "That email address doesn't exist.");
	}
	
	
	@AfterMethod
	public void tearDown(){
		ElementUtil.quitBrowser(driver);
	}
	
}
