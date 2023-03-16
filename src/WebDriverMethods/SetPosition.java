package WebDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Windows.html");

		Thread.sleep(4000);

		// Point P1 =new Point(100,400);

		Thread.sleep(3000);

		// driver.manage().window().setPosition(P1);

		// GetPosition
		Thread.sleep(6000);

		System.out.println(driver.manage().window().getPosition());

	}

}