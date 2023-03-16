package TestSuite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Login_Guru99 {
	WebDriver driver;

	@Test
	public void Login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(CO);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr472933");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("UqEryra");
		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();

		System.out.println(driver.findElement(By.xpath("//marquee[@class=\"heading3\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//td[text()=\"Manger Id : mngr472933\"]")).getText());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//a[text()=\"Log out\"]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.quit();
	}
}
