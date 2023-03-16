package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Thread.sleep(5000);

		// Convert web driver object to TakeScreenshot & Call getScreenshotAs method to
		// create image file

		File Source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// Move image file to new destination
		File Dest = new File("/Users/ranjeetkendre/Desktop/9July/Sample.jpg");

		// Copy file at destination
		FileHandler.copy(Source, Dest);

	}

}