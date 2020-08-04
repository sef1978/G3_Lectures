package Week2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Week1_SeleniumMethods.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_12_XPathConcept {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
	
//		WebElement userEl = driver.findElement(By.xpath("//input[@id='username']"));
//		userEl.sendKeys("seh23@gmail.com");
//		WebElement pword = driver.findElement(By.xpath("//input[@id='password']"));
//		pword.sendKeys("she4366");
//		WebElement loginBtn = driver.findElement(By.xpath("//button[@id='loginBtn']"));
//		loginBtn.click();
		
		By username = By.xpath("//input[@id='username']");
		By password = By.xpath("//input[@id='password']");
		By loginBtn = By.xpath("//button[@id='loginBtn']");
		
		ElementUtil.getElement(driver, username).sendKeys("sef3@gmail.com");
		ElementUtil.getElement(driver, password).sendKeys("543hsgsf");
		ElementUtil.getElement(driver, loginBtn).click();		

		Thread.sleep(3000);
		driver.quit();
	}

}
