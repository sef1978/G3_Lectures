package week5_JavaScriptExecuter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_45_DragAndDrop {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		WebElement sourceEl = driver.findElement(By.id("draggable"));
		WebElement targetEl = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(sourceEl, targetEl).release().build().perform(); // this is better usage

		actions.clickAndHold(sourceEl).moveToElement(targetEl).build().perform(); // this is better usage
		
		driver.close();
		
	}

}
