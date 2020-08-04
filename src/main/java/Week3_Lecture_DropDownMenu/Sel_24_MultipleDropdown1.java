package Week3_Lecture_DropDownMenu;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_24_MultipleDropdown1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/sefikaarslan/Documents/DRIVERS/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		
		selectMultiple(driver, By.xpath("//span[@class='comboTreeItemTitle']"), "choice 5");
		
		driver.quit();
	}
	
	
	/**
	 * Generic method to find selected multiple element
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public static void selectMultiple(WebDriver driver, By locator, String value){

		List<WebElement> dropList = driver.findElements(locator);
		
		for (int i = 0; i < dropList.size(); i++) {
			String text = dropList.get(i).getText();
			System.out.println(text);
			
			// ignore the empty lines
			if (!text.isEmpty()) {
				dropList.get(i).click();
			if (text.equals("choice 5")) {
				dropList.get(i).click();
				break;
			}
			}
	}
	}	
}