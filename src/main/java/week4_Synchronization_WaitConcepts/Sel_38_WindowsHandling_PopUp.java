package week4_Synchronization_WaitConcepts;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_38_WindowsHandling_PopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		// getWindowHandle==get current window handling
		// getWindowsHandles==get the window handles that opened
		// switchTo().window()==switch to between windows
		
		driver.findElement(By.linkText("Good PopUp #3")).click(); // child window 3

//		driver.findElement(By.xpath("//a[contains(text(),‘Good PopUp #1’)]")).click();
		
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> iterator = handles.iterator();
		String parentWindowId = iterator.next();
		// if we use window handle we have to start from the main window.
		System.out.println("Parent window ID : " + parentWindowId);
		
		String childWindowID = iterator.next();
		System.out.println("Child window ID : " + childWindowID);
		Thread.sleep(5000);
		
		String childWindow2ID = iterator.next();
		System.out.println("Child2 window ID : " + childWindow2ID);
		Thread.sleep(3000);
		
//		driver.switchTo().window(String handle);
//		driver.getWindowHandles();
//		for(String handle: driver.getWindowHandles()){
//			driver.switchTo().window(handle);
//			if(driver.getTitle().equals(childWindow2ID)){ 
//				//break;
//		} }
		
		
		
		// switch the window
		driver.switchTo().window(childWindowID);
		System.out.println("Child Window Title is : " + driver.getTitle());
		Thread.sleep(5000);
		
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent Window Title is : " + driver.getTitle());
		Thread.sleep(5000);
		
		driver.switchTo().window("Child window2ID");
		System.out.println("Child Window Title is : " + driver.getTitle());
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
