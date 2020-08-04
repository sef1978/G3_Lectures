package week5_JavaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_40_JavaScriptUtilExamples {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://app.hubspot.com/login");
		driver.get("https://darksky.net/");
		
		Thread.sleep(5000);
		
//		System.out.println(driver.getTitle()); // first way with Selenium
		
		// get title with JS (JavaScript)
		
		String title = JavaScriptUtil.getTitleByJS(driver); // second way with JS
		System.out.println(title);

		//click with JS
//		WebElement signUpLink = driver.findElement(By.linkText("Sign up"));
//		JavaScriptUtil.clickElementByJS(signUpLink, driver);
//		Thread.sleep(5000);
		
		
		// refresh with JS
//		JavaScriptUtil.refreshBrowserByJS(driver);
		
		// generate alert
//		JavaScriptUtil.generateAlert(driver, "This page is sign up page");
		
		// send keys method with JS
//		WebElement username = driver.findElement(By.id("username"));
//		JavaScriptUtil.sendKeysUsingJSWithID(driver, "username", "SA@sample.com");
//		JavaScriptUtil.drawBorder(username, driver);
//		JavaScriptUtil.drawBorder(signUpLink, driver);
	
		// flash method with JS
//		WebElement username = driver.findElement(By.id("username"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
//		
//		JavaScriptUtil.flash(username, driver);
//		username.sendKeys("SA@sample.com");
//		
//		JavaScriptUtil.flash(password, driver);
//		password.sendKeys("sa3453");
//		
//		JavaScriptUtil.flash(loginBtn, driver);
//		loginBtn.click();
		
		 // why we use flash method?
         // Sometimes the automation script can be very long, and we may not be able to 
		 // recognize which element is clicked or interacted with. Therefore we use flash if necessary
		
//		System.out.println(JavaScriptUtil.getPageInnerText(driver));
		
//		System.out.println(JavaScriptUtil.getBrowserInfo(driver));
		
//		JavaScriptUtil.scrollPageDown(driver);
		
//		JavaScriptUtil.specificScrollPageDown(driver); // methodun icindeki sayiyi degistirerek kaydirma yapabiliriz
		
		WebElement privacy = driver.findElement(By.xpath("//a[contains(text(),'Privacy')]"));
		JavaScriptUtil.scrollIntoView(privacy, driver);
		JavaScriptUtil.clickElementByJS(privacy, driver);
		
//		driver.close();
	}

}
