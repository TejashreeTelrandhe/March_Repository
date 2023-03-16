package TestSuite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BalanceInquiry_Guru99 {
	WebDriver driver;

	@Test
	public void BlaanceInquiry() throws InterruptedException {
		System.setProperty("webdriiver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(CO);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr472933");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("UqEryra");
		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();

		driver.findElement(By.xpath("//a[text()=\"Balance Enquiry\"]")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[text()=\"Balance Enquiry\"]")).click();

		System.out.println(driver.findElement(By.xpath("//p[@class=\"heading3\"]")).getText());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//input[@name=\"accountno\"]")).sendKeys("119087");
		driver.findElement(By.xpath("//input[@name=\"AccSubmit\"]")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
