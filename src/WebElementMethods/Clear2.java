package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		Thread.sleep(2000);
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("1234");
		Email.clear();

		WebElement pass = driver.findElement(By.id("pass"));
		Thread.sleep(2000);
		pass.sendKeys("123e");
		pass.clear();
	}

}