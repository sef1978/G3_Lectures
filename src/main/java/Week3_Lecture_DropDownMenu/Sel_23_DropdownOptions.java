package Week3_Lecture_DropDownMenu;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel_23_DropdownOptions {

	public static void main(String[] args) {
		// we can use WebDriverManager.chromeDriver.Setup(); or 
		System.setProperty("webdriver.chrome.driver", "/Users/sefikaarslan/Documents/DRIVERS/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement day = driver.findElement(By.id("day"));
//		WebElement month = driver.findElement(By.id("month"));
//		WebElement year = driver.findElement(By.id("year"));
		
		Select select = new Select(day);
		
		List<WebElement> dayOptions = select.getOptions();
		System.out.println(dayOptions.size());
		
		for (int i = 0; i < dayOptions.size(); i++) {
			System.out.println(dayOptions.get(i).getText());
		}
		
		

	}

}
