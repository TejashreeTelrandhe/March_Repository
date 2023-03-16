package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {

	public static void main(String[] args) throws InterruptedException {

		// Step 1
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Windows.html");

		// driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();

		Thread.sleep(3000);

		// driver.close();

		driver.quit();

		// Quit - This method is the alternate method to the close method

		// Difference - close method is used to close the current tab only & quite
		// method
		// is used to close all the tab of the browser

	}

}