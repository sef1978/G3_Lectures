package Week1_SeleniumMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_04_AlertHandling1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
				
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
				
//		WebDriverManager.geckodriver().setup();
//		
//		WebDriver driver = new FirefoxDriver();
						
		WebDriverManager.chromedriver().browserPath(null).setup();
			
		// Locators
		driver.findElement(By.name("proceed")).click();

		Thread.sleep(4000);
		
		// to handle the alert we will use Alert interface
		
        Alert alert = driver.switchTo().alert(); // dont forget this concept very important
        alert.getText();
        String text = alert.getText();
        System.out.println(text);
        
        // Verification
        if (text.equals("Please enter a valid user name")) {
			System.out.println("correct text : " + text);
		}else {
			System.out.println("incorrect text : " + text);
		}  
       
        //alert.accept();
        alert.dismiss();
        
        driver.close();
        System.out.println("Test completed");
        
        
        
        
          
      
        
        
        
        
        
        
	}

}
