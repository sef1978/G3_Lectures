package week5_JavaScriptExecuter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_46_HeadlessHTMLUnitDriver {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new HtmlUnitDriver(); // fastest 
		driver.get("https://siliconelabs.com");
		
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		
	}

}
