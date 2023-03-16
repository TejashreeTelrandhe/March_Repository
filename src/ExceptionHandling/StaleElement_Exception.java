package ExceptionHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement_Exception {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement Link = driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));
//		Link.click();
		try {
			Link.click();	
		}
		catch(StaleElementReferenceException s) {
			s.printStackTrace();
			System.out.println(s.getMessage());
		}
		finally {
			System.out.println("Finally block executed after handling Stale Element Reference Exception");
		}
		driver.quit();
	}

}
