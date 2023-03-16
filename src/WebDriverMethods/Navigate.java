package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		Thread.sleep(3000);

		String Page1 = driver.getTitle();
		System.out.println(Page1);

		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);

		String Page2 = driver.getTitle();
		System.out.println(Page2);
		Thread.sleep(3000);

		driver.navigate().back(); // Flipkart
		Thread.sleep(5000);

		driver.navigate().forward(); // Amazon
		Thread.sleep(5000);

		driver.navigate().refresh(); // Amazon
		Thread.sleep(3000);

		driver.navigate().back(); // flipkart
	}

}