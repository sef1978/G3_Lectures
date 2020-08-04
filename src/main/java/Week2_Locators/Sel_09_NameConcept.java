package Week2_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Week1_SeleniumMethods.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_09_NameConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/login");

		Thread.sleep(3000);
		
		// First usage
//		WebElement userEl = driver.findElement(By.name("username"));
//		userEl.sendKeys("shf12@gmail.com");
//		WebElement userPw = driver.findElement(By.name("password"));
//		userPw.sendKeys("shf1265");
		
		
		
		// Second usage
//		driver.findElement(By.name("username")).sendKeys("shf12@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("shf1234");
		
		
		
		// Third usage
		By username = By.name("username");
//		WebElement element = driver.findElement(username);
//		element.sendKeys("shf12@gmail.com");
		By pword = By.name("password");
		
		
		
		// Fourth usage
		ElementUtil.getElement(driver, username).sendKeys("shf12@gmail.com");
		ElementUtil.getElement(driver, pword).sendKeys("shf324");
		
	}

}
