package week5_JavaScriptExecuter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_48_RightClickMe {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

//		When maximized (driver.manage().window().maximize()), 
//		the title bar etc. of the window is still displayed. 
//		In fullscreen mode (driver.manage().window().fullscreen()), 
//		the title bar is not displayed.
		
		Actions actions = new Actions(driver);
		
		WebElement rightClickElement = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		actions.contextClick(rightClickElement).build().perform();
		
		WebElement copyElement = driver.findElement(By.className("context-menu-icon-copy"));
		
		String text = copyElement.getText();
		System.out.println(text);
		if(text.equals("Copy")){
			System.out.println("Correct text : " + text);
		}else{
			System.out.println("incorrect text");
		}

		By smartPhone = By.id("thirdLevel00");
		WebElement locator = driver.findElement(smartPhone);
		locator.click();
		
		driver.close();
	}

}
