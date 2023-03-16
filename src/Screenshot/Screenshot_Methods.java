package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot_Methods {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ixigo.com/flights");
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.xpath("//div[@class=\"banner-line\"]"));
		WebElement e2 = driver
				.findElement(By.xpath("//div[@class=\"header max-container-width background-white undefined\"]"));
		WebElement e3 = driver.findElement(By.xpath("//div[@class=\"form-fields\"]"));

		screenshot(e1);
		screenshot(e2);
		screenshot(e3);
		
		Thread.sleep(3000);
		driver.quit();
	}

	public static void screenshot(WebElement element) throws IOException {
		File src = ((TakesScreenshot) element).getScreenshotAs(OutputType.FILE);
		String filename = "Ixigo";
		String random = RandomString.make(3);
		File dest = new File("C:\\Users\\Tejashree\\eclipse-workspace\\Selenium_Section1_2\\Screenshot\\" + filename
				+ "" + random + ".png");
		FileHandler.copy(src, dest);
	}
}
