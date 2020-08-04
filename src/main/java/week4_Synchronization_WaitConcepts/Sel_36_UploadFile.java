package week4_Synchronization_WaitConcepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_36_UploadFile {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		driver.findElement(By.name("upfile")).sendKeys("/Users/sefikaarslan/Desktop/shef.txt");

		// text app a gidip bi dosya olusturup isim veriyoruz.ustune sag tiklayip path ini kopyalayip buraya yapistirdik.
		// yada dosyayi terminale atip ordan da alabiliriz path i.
	
driver.quit();
		
		
	}

}
