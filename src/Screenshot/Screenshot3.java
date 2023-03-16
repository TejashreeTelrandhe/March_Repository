package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		Thread.sleep(3000);

		File Source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String Random = RandomString.make(5);

		String Filename = "Google";

		File Des = new File("/Users/ranjeetkendre/Desktop/eclipse-workspace/TesNgTutorial/9_July_Automation/Screenshot/"
				+ Filename + "" + Random + ".png");

		File Des1 = new File("./Screenshot/" + Filename + "" + Random + ".png");

		// File Des2 = new File(("user.dir")+"/Screenshot/"+Filename+""+Random+".png");

		FileHandler.copy(Source, Des1);

		driver.quit();
	}

}