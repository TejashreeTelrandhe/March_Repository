package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class IxigoScreenshot_Eclipse {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ixigo.com/flights");
		Thread.sleep(3000);

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String filename = "ixigo";

		String random = RandomString.make(3);

		File dest = new File("C:\\Users\\Tejashree\\eclipse-workspace\\Selenium_Section1_2\\Screenshot\\" + filename
				+ random + ".png");

		FileHandler.copy(src, dest);
		
		System.out.println("Screenshot captured in eclipse");
		Thread.sleep(3000);
		driver.quit();
	}

}
