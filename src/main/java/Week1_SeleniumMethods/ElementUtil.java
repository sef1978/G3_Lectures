package Week1_SeleniumMethods;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * 
 * @author sefikaarslan
 *
 */
public class ElementUtil {
	
	public static WebDriverWait wait;
	public static String title;
	
	// we create common methods for all test caese
	// we can use these methods again and again
	
	
	/**
	 * This method is used to handle alert
	 * @param driver
	 * @return
	 */
	public static String getAlertText(WebDriver driver){
		
	// Generic method(common methods)
		Alert alert = driver.switchTo().alert(); // dont forget this concept very important
	        alert.getText();
	        String text = alert.getText();
	        System.out.println(text);
	        alert.accept();
	        return text;

	}
	
	
	/**
	 * this method is used to launch browser
	 * @param driver
	 * @param browserName
	 * @return 
	 */
	public static WebDriver launchBrowser(WebDriver driver, String browserName){
		
		if (browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "/Users/sefikaarslan/Documents/DRIVERS/chromedriver");
			driver = new ChromeDriver();
		}else if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "/Users/sefikaarslan/Documents/DRIVERS/geckodriver");
			driver = new FirefoxDriver();
		}else {
			System.out.println("Browser is not available : " + browserName);
		}
		return driver;
	}
	
	
	/**
	 * This method is used to navigate URL
	 * @param driver
	 * @param url
	 */
	public static void launchURL(WebDriver driver, String url) {
		driver.get(url);
	}
	
	
	/**
	 * This method is used to get title from webPage
	 * @param driver
	 * @return
	 */
	public static String getPageTitle(WebDriver driver) {
		return driver.getTitle();
	}
	
	
	/**
	 * selectDropdownByIndex
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public static void selectDropDownValueByIndex(WebDriver driver, By locator, int index){
		WebElement element = getElement(driver, locator);
		Select select = new Select(element);
		select.selectByIndex(index);
	} 
	
	/**
	 * selectDropdownByVisibleText
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
	 * selectDropDownValueByText
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public static void selectDropDownValueByText(WebDriver driver, By locator, String value){
		WebElement element = getElement(driver, locator);
		Select select = new Select(element);
		select.selectByVisibleText(value);
	} 
	
	
	/**
	 * This method is used to get element 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver, By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}
	
	
	/**
	 * This method is used to get the element from HTML
	 * @param driver
	 * @param locator
	 */
	public static void clickOn(WebDriver driver, By locator) {
		driver.findElement(locator).click();
	}
	
	
	/**
	 * This method is used to close browser
	 * @param driver
	 */
	public static void closeBrowser(WebDriver driver) {
		driver.close();
	}

	
	/**
	 * This method is used to quit browser
	 * @param driver
	 */
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
	
	
	/**
	 * Generic method to find selected multiple element
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public static void selectMultipleValue(WebDriver driver, By locator, String value){

		List<WebElement> dropList = driver.findElements(locator);
		
		for (int i = 0; i < dropList.size(); i++) {
			String text = dropList.get(i).getText();
			System.out.println(text);
			
			// ignore the empty lines
			if (!text.isEmpty()) {
				dropList.get(i).click();
			if (text.equals(value)) {
				dropList.get(i).click();
				break;
			}
			}
		}
	}
	

	/**
	 * select Single Value from dropdown
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public static void selectSingleValue(WebDriver driver, By locator, String value){
		
     List<WebElement> dropList = driver.findElements(locator);
		System.out.println(dropList.size());
		
		for (int i = 0; i < dropList.size(); i++) {
			String text = dropList.get(i).getText();
//			System.out.println(text);
			
			try {
				if (!text.isEmpty()) {
					if (text.equals(value)){
						dropList.get(i).click();
						break;
					    }      
					}
			}catch (Exception e) {
				
			}
		  }	
	}
	
	
	/**
	 * is Multiple element?
	 * @param driver
	 * @param element
	 * @param value
	 */
	public static void isMultiple(WebDriver  driver, WebElement element, String value){
		Select select = new Select(element);
		System.out.println("Is the drop down multiple? : " + select.isMultiple());
	}	
	
	
	/**
	 * is the element Selected?
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

	
	/**
	 * select Multiple DropDown with args concept(String ...)
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
	
	
	/**
	 * getTable row size
	 * @param driver
	 * @return
	 */
	public static int getTableCount(WebDriver driver){
		List<WebElement> rowList = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		int rowCount =  rowList.size();
//		System.out.println(rowCount);
		return rowCount;
	}
	
	
	/**
	 * getColumnData
	 * @param driver
	 * @param beforeXpath
	 * @param afterXpath
	 */
	public static ArrayList<String> getColumnData(WebDriver driver, String beforeXpath, String afterXpath){
		ArrayList<String> data = new ArrayList<String>();
		for (int rowNum = 2; rowNum <= getTableCount(driver); rowNum++) {
			   String actualXpath = beforeXpath + rowNum + afterXpath;	
//			   System.out.println(actualXpath);
			   String text = driver.findElement(By.xpath(actualXpath)).getText();
			   System.out.println(text);
			   data.add(text);
			}
		return data;
	}
	
	
	/**
	 * presence of element located
	 * @param locator
	 * @return
	 */
	public boolean waitForTitlePresent(By locator){
		wait.until(ExpectedConditions.titleIs(title));
		return true;
	}
	
	
	/**
	 * visibility of element located
	 * @param locator
	 * @return
	 */
	public boolean waitForElementPresent(By locator){
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		return true;
	}
	
	
	/**
	 * 
	 * @param driver
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public static WebElement getElement(WebDriver driver, By locator, int timeout){
		waitForPresenceOfElement(driver, locator, timeout);
		WebElement element = driver.findElement(locator);
		return element;
	}
	
	/**
	 * 
	 * @param driver
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public static WebElement getElementOfAlert(WebDriver driver, By locator, int timeout){
		WebElement element = driver.findElement(locator);
		waitForPresenceOfElement(driver, locator, timeout);
		clickOn(driver, locator);
		return element;
	}
	
	/**
	 * 
	 * @param driver
	 * @param locator
	 * @param timeout
	 */
	public static void waitForPresenceOfElement(WebDriver driver, By locator, int timeout){
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
	/**
	 * 
	 * @param driver
	 * @param element
	 * @param locator
	 */
	public static void printAllOptions(WebDriver driver, WebElement element, By locator, Select select){

		Select selectEl = new Select(element);
		List<WebElement> allOpt = selectEl.getOptions();
		System.out.println(allOpt.size());
		
		for (int i = 0; i < allOpt.size(); i++) {
			System.out.println(allOpt.get(i).getText());
		}
}
	

	/**
	 * 
	 * @param driver
	 * @param alert
	 * @param text
	 * @return
	 */
	public static String alertIsHandled(WebDriver driver, String text){
		Alert alert = driver.switchTo().alert();
	     alert.getText();
	     String text1 = alert.getText();
	     if (text1.equals(text)) {
				System.out.println("correct text : " + text1);
			}else {
				System.out.println("incorrect text : " + text1);
			} 
	     alert.accept();
	     System.out.println("Alert is handled");
	     return text;
	    }

	/**
	 * 
	 * @param driver
	 * @param alert
	 * @param text
	 * @return
	 */
	public static String alertIsHandledWithWait(WebDriver driver, By locator, String text, int timeout){
	
		getElementOfAlert(driver, locator, timeout);
		Alert alert = driver.switchTo().alert();
	     String text1 = alert.getText();
	     if (text1.equals(text)) {
				System.out.println("correct text : " + text1);
			}else {
				System.out.println("incorrect text : " + text1);
			} 
	     alert.accept();
	     System.out.println("Alert is handled");
	     return text;
	    }
}
	
	

