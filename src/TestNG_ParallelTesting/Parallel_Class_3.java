package TestNG_ParallelTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Parallel_Class_3 {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(CO);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	}
	
	@Test
	public void CustomisedStatement() {
		driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr472933");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("UqEryra");
		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();

		driver.findElement(By.xpath("//a[text()=\"Customised Statement\"]")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[text()=\"Customised Statement\"]")).click();

		System.out.println(driver.findElement(By.xpath("//p[@class=\"heading3\"]")).getText());

		driver.findElement(By.xpath("//a[text()=\"Log out\"]")).click();
		driver.switchTo().alert().accept();
	}
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
