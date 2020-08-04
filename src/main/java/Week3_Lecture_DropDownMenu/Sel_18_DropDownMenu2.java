package Week3_Lecture_DropDownMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel_18_DropDownMenu2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/sefikaarslan/Documents/DRIVERS/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        
        // Locators
        WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		selectDropdownValueByText(day, "9");
		selectDropdownValueByText(month, "Sep");
		selectDropdownValueByText(year, "2012");
		
		Thread.sleep(3000);

//		selectDropdownByIndex(day, 9);
//		selectDropdownByIndex(month, 9);
//		selectDropdownByIndex(year, 9);
	
		driver.close();
		
	}

	
	/**
	 * generic method for finding text
	 * @param element
	 * @param value
	 */
	public static void selectDropdownValueByText(WebElement element, String value){
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	
	/**
	 * generic method for finding by index
	 * @param element
	 * @param index
	 */
	public static void selectDropdownByIndex(WebElement element, int index){
		Select select = new Select(element);
		select.selectByIndex(index);
	}
}
