package Week1_SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sel_06_AlertHandling3 {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://mail.rediff.com/cgi-bin/login.cgi";
		
		By goBtn = By.name("proceed");
	
		// Launch the browser
		driver = ElementUtil.launchBrowser(driver, "chrome");
		 
		// launch URL
		ElementUtil.launchURL(driver, url);
		
		// get title
//		String title = ElemenUtil.getPageTitle(driver);
//		System.out.println(title);    // yada direk syso icinde asagidaki gibi cagrilabilir
		System.out.println(ElementUtil.getPageTitle(driver));
		
		// click on sign in button
		ElementUtil.clickOn(driver, goBtn);
		
		Thread.sleep(4000);
		
		// handling alert
		String text = ElementUtil.getAlertText(driver);
		if (text.equals("Please enter a valid user name")) {
			System.out.println("correct text");
		}else {
			System.out.println("incorrect text");
		}
		
		// Close browser
//		ElemenUtil.quitBrowser(driver);
//		ElementUtil.closeBrowser(driver);
	

	}

}
