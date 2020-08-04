package Week3_Lecture_DropDownMenu;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_26_selectMultipleOption {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/sefikaarslan/Documents/DRIVERS/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();

		By loc = By.xpath("//span[@class='comboTreeItemTitle']");
		
		selectMultipleDropDown(driver, loc, "choice 1", "choice 2", "choice 7");
		
		driver.quit();
	}
	
	/**
	 * select Multiple DropDown
	 * @param driver
	 * @param value
	 */
	public static void selectMultipleDropDown(WebDriver driver, By locator, String... value){
		
		List<WebElement> dropList = driver.findElements(locator);
		System.out.println(dropList.size());
		
		for (int i = 0; i < dropList.size(); i++) {
			String text = dropList.get(i).getText();
//			System.out.println(text);
			for (int j = 0; j < value.length; j++) {
				try {
					if (!text.isEmpty()) {
						if (text.equals(value[j])) {
							dropList.get(i).click();
							break;
						}
					}
				} catch (Exception e) {
					
				}
			}
	}
	}
}
