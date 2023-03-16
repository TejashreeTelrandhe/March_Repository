package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_DownUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);

		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("window.scrollBy(0,-5000)", "");
		System.out.println("Scroll down by 5000 pixel");
		Thread.sleep(3000);

		JS.executeScript("window.scrollBy(0,3000)", "");
		System.out.println("Scroll up by 3000 pixel");
		Thread.sleep(3000);

		JS.executeScript("window.scrollBy(0,-10000)", "");
		System.out.println("Scroll down by 10000 pixel");
		Thread.sleep(3000);

		JS.executeScript("window.scrollBy(0,6000)", "");
		System.out.println("Scroll up by 6000 pixel");
		Thread.sleep(3000);
	}
}
