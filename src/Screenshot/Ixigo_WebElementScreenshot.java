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

public class Ixigo_WebElementScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ixigo.com/flights");
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.xpath("//div[@class=\"banner-line\"]"));
		
		File src = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Tejashree\\Desktop\\AutoScreenshot\\IxigoFlight"+".png");
		FileHandler.copy(src, dest);
		
		Thread.sleep(3000);		
		driver.quit();
	}

}
