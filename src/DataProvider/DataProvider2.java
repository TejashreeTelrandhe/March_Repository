package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DataProvider2 {

	WebDriver driver;

	@BeforeMethod
	public void SetUp() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	public void LoginTest() throws InterruptedException {
		driver.get("https://admin-demo.nopcommerce.com/login");

		WebElement Username = driver.findElement(By.xpath("//input[@id=\"Email\"]"));
		Thread.sleep(2000);
		Username.clear();
		Thread.sleep(2000);
		Username.sendKeys("");

		WebElement Password = driver.findElement(By.xpath("//input[@id=\"Password\"]"));
		Thread.sleep(2000);
		Password.clear();
		Thread.sleep(2000);
		Password.sendKeys("");

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		String Exp_Title = "Dashboard / nopCommerce administration";

		String Act_Title = driver.getTitle();

		if (Exp_Title.equals("valid")) {
			if (Exp_Title.equals(Act_Title)) {

				driver.findElement(By.linkText("logout")).click();
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}
		}
	}

	@AfterMethod
	public void Teardown() {
		driver.quit();
	}

}