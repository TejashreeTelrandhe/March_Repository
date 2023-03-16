package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Horizontal_Scrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.album.alexflueras.ro/");
		Thread.sleep(3000);

		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("window.scrollBy(5000,0)","" );
		System.out.println("Scroll horizontal by 5000 pixel right");
		Thread.sleep(3000);
		
		JS.executeScript("window.scrollBy(-3000,0)", "");
		System.out.println("Scroll horizontal by 3000 pixel left");
		Thread.sleep(3000);

		JS.executeScript("window.scrollBy(10000,0)", "");
		System.out.println("Scroll horizontal by 10000 pixel right");
		Thread.sleep(3000);
		
		JS.executeScript("window.scrollBy(-8000,0)", "");
		System.out.println("Scroll horizontal by 8000 pixel left");
		Thread.sleep(3000);

	}

}
