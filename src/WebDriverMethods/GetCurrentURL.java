package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		String CurrentURL = driver.getCurrentUrl();
		System.out.println(CurrentURL);

		if (CurrentURL.equals("https://www.facebook.com/"))
			System.out.println("Correct URL");
		else
			System.out.println("Incorrect URL");

		driver.quit();

	}

}