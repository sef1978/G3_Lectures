package week5_JavaScriptExecuter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_47_MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.verizonwireless.com/");
		
//		WebElement phoneMenu = driver.findElement(By.xpath("//button[contains(text(),'Phone list']"));
//		WebElement Pmenu = driver.findElement(By.id("secondLevel0")); // bu da calisir
		WebElement pM = driver.findElement(By.xpath("//span[contains(text(),'Phones')]")); // bu da calisir
		
		//span[contains(text(),'Phones')]

		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.moveToElement(pM).build().perform();
		Thread.sleep(2000);
		
		By smartPhone = By.id("thirdLevel00");
		WebElement locator = driver.findElement(smartPhone);
		locator.click();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
