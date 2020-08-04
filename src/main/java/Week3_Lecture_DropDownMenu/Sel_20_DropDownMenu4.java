package Week3_Lecture_DropDownMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel_20_DropDownMenu4 {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/sefikaarslan/Documents/DRIVERS/chromedriver");
//        WebDriver driver = new ChromeDriver();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        // Locators
        By day = By.id("day");
        By month = By.id("month");
        By year = By.id("year");
       
        selectDropdownByIndex(driver, day, 5);
        selectDropdownByIndex(driver, month, 9);
        selectDropdownByIndex(driver, year, 12);
        
        driver.close();
        
	}
	
	/**
	 * 
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public static void selectDropdownByIndex(WebDriver driver, By locator, int index){
		WebElement element = getElement(driver, locator);
		Select select = new Select(element);
		select.selectByIndex(index);
		
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


