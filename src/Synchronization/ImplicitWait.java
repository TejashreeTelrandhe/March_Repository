package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Implicit wait always applied globally and it's available for all weblement on
		// the webpage

		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS); // MO

		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/");

		driver.findElement(By.id("w3loginbtn")).click();
//		
		Thread.sleep(25000);

		driver.findElement(By.xpath("//input[@id=\"modalusername\"]")).sendKeys("QWERTY");

	}
}