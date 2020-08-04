package week4_Synchronization_WaitConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_37_AuthPopUp {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.get("https://the-internet.herokuapp.com/basic_auth");
	
		// username is admin
		// password is admin
		
		// https://admin:admin@the-internet-internet.herokuapp.com/basic_auth
		
		
		
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String username = "admin";
		String password = "admin";
		
		// https://admin:admin@the-internet.internet.herokuapp.com/basic_auth
		
		driver.get("https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth");
		
		driver.quit();
		
	}

}
