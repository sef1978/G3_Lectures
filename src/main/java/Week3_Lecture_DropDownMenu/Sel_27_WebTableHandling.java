package Week3_Lecture_DropDownMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_27_WebTableHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		//right click copy and copy xpath on the element inspect
		
		//*[@id="customers"]/tbody/tr[2]/td[1] // 2.siradaki company name
		//*[@id="customers"]/tbody/tr[3]/td[1] // 3.siradaki company name
		//*[@id="customers"]/tbody/tr[7]/td[1] // 7.siradaki company name
		
		String beforeXpath = "//*[@id='customers']/tbody/tr["; // do single quotes
		String afterXpathCompany = "]/td[1]";
		System.out.println("Company names........");
		for (int i = 2; i <= 7; i++) {
			String actualXpath = beforeXpath + i + afterXpathCompany;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			if (element.getText().equals("Island Trading")) {
				System.out.println("Company name : " + element.getText() + " is found");
				break;
			}// we found a specific element in the table with this if statement
		}
		System.out.println("------------------------------------");
		
		
		
		//*[@id="customers"]/tbody/tr[2]/td[2]  // 2.siradaki Maria
		//*[@id="customers"]/tbody/tr[3]/td[2]  // 3.siradaki Germany
		
		String afterXpathContact = "]/td[2]";
		System.out.println("Contact names........");
		for (int i = 2; i <= 7; i++) {
			String actualXpath = beforeXpath + i + afterXpathContact;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
		}
		System.out.println("------------------------------------");
		
		
		
		//*[@id="customers"]/tbody/tr[2]/td[3]  // 2.siradaki country
		//*[@id="customers"]/tbody/tr[3]/td[3]  // 3.siradaki country
		
		String afterXpathCountry = "]/td[3]";
		System.out.println("Country names........");
		for (int i = 2; i <= 7; i++) {
			String actualXpath = beforeXpath + i + afterXpathCountry;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
		}
		
	}

}
