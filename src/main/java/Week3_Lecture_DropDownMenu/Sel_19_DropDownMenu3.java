package Week3_Lecture_DropDownMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel_19_DropDownMenu3 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "/Users/sefikaarslan/Documents/DRIVERS/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        // Locators
        By day = By.id("day");
        By month = By.id("month");
        By year = By.id("year");
       
        selectDropdownByVisibleText(driver, day, "9");
        selectDropdownByVisibleText(driver, month, "Apr");
        selectDropdownByVisibleText(driver, year, "2009");
        Thread.sleep(3000);
        driver.close();
	}
	
	
	/**
	 * 
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public static void selectDropdownByVisibleText(WebDriver driver, By locator, String value){
		WebElement element = getElement(driver, locator);
		Select select = new Select(element);
		select.selectByVisibleText(value);
		
	}
	
	
	/**
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver, By locator){
		WebElement element = driver.findElement(locator);
		return element;
	}
}
