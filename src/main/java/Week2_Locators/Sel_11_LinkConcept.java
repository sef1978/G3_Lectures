package Week2_Locators;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_11_LinkConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(4000);
		
//		By signUp = By.linkText("Sign up");
//		By signUpPar = By.partialLinkText("Sign up");
//		ElementUtil.getElement(driver, signUpPar).click();
		
//		By prvcy = By.partialLinkText("Policy"); // Privacy Policy
//		ElementUtil.getElement(driver, prvcy);
		
//		WebElement userEl = driver.findElement(By.xpath("//input[@id='username']"));
//		userEl.sendKeys("seh23@gmail.com");
//		WebElement pword = driver.findElement(By.xpath("//input[@id='password']"));
//		pword.sendKeys("she4366");
//		WebElement loginBtn = driver.findElement(By.xpath("//button[@id='loginBtn']"));
//		loginBtn.click();
		
//		By username = By.xpath("//input[@id='username");
//		By pword = By.xpath("//input[@id='password");
//		By loginBtn = By.xpath("//button[@id='loginBtn']");
//		
		
		
		
		

		
		
	}

}
