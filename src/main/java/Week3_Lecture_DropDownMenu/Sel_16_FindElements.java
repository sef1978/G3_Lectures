package Week3_Lecture_DropDownMenu;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_16_FindElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.amazon.com");
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// find elements == tagName
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		// tag name "a" provides links
		System.out.println("Total link is : " + linkList.size());
		
		for (int i = 0; i < linkList.size(); i++) {
			String text = linkList.get(i).getText();
//			System.out.println(text);
			
			if (!text.isEmpty()) {
				System.out.println(text);
			}
			
			if (text.equals("Wave of grief as mortal remains Ladakh martyrs reach home")) {
				linkList.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		

	}

}
