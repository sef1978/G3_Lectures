package Week3_Lecture_DropDownMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_17_DropDownMenu1 {

	public static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().browserVersion("81.0.4044.69").setup();
		ChromeOptions chromeOptions = new ChromeOptions(); // ChromeOptions is a class

		chromeOptions.setHeadless(false);
		driver = new ChromeDriver(chromeOptions);
		
		driver.get("https://www.facebook.com");
		
		// Locators
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		// Select
		Select select1 = new Select(day);
		select1.selectByVisibleText("9");
		
		Select select2 = new Select(month);
		select2.selectByVisibleText("Sep");
		
		Select select3 = new Select(year);
		select3.selectByVisibleText("2019");
		
		driver.close();
		
		
	}

}
