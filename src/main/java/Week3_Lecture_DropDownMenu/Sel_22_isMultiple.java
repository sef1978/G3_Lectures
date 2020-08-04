package Week3_Lecture_DropDownMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_22_isMultiple {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setHeadless(false);
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.facebook.com");

//		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
//		WebElement year = driver.findElement(By.id("year"));
		
//		Select select = new Select(month);
		
		// dropdown is multiple or not(isMultiple)
//		System.out.println(select.isMultiple());
		
		// to verify dropDown is selected or not
//		WebElement option = select.getFirstSelectedOption();
//		String selectedText = option.getText();
//		System.out.println(selectedText);
		
		isMultiple(driver, month, "month");
		isSelected(driver, month, "month");
	}

	/**
	 * 
	 * @param driver
	 * @param element
	 * @param value
	 */
	public static void isMultiple(WebDriver  driver, WebElement element, String value){
		Select select = new Select(element);
		System.out.println("Is the drop down multiple? : " + select.isMultiple());
	}	
	/**
	 * 
	 * @param driver
	 * @param element
	 * @param value
	 */
	public static void isSelected(WebDriver  driver, WebElement element, String value){	
		Select select = new Select(element);
		WebElement option = select.getFirstSelectedOption();
		String selectedText = option.getText();
		System.out.println("The selected element is: " + selectedText);
	}
}
