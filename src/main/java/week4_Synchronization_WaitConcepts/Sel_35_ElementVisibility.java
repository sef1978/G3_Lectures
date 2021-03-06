package week4_Synchronization_WaitConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_35_ElementVisibility {

	public static void main(String[] args) {
		
		// System.setProperty()
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();

				driver.get("https://classic.crmpro.com/register/");

				WebElement submitElement = driver.findElement(By.id("submitButton"));

				// isDisplayed() --> gorunurluluk
				// isEnabled()   --> tiklanabilirlilik
				// isSelected()  --> secilmis olmasi

				System.out.println("Before submit button is enabled");
				System.out.println(submitElement.isDisplayed());
				System.out.println(submitElement.isEnabled());

				System.out.println("Line 29 is: " + driver.findElement(By.name("agreeTerms")).isSelected());

				System.out.println("******************");
				
				driver.findElement(By.name("agreeTerms")).click();

				System.out.println("Line 33 is: " + driver.findElement(By.name("agreeTerms")).isSelected());

				System.out.println("After submit button is enabled");
				System.out.println(submitElement.isDisplayed());
				System.out.println(submitElement.isEnabled());

				driver.quit();
			}

	}


