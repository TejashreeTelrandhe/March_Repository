package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateSetSizeGetSize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);

		driver.manage().window().maximize();

		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		System.out.println("navigate to method");
		driver.navigate().refresh();
		Thread.sleep(3000);
		System.out.println("navigate refresh method");
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println("navigate back method");
		driver.navigate().forward();
		Thread.sleep(3000);
		System.out.println("navigate forward method");

		Dimension d = new Dimension(300, 400);

		driver.manage().window().setSize(d);
		System.out.println();
		System.out.println("Size of window = " + driver.manage().window().getSize());
	}

}
