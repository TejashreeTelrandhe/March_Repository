package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider3 {

	WebDriver driver;

	@BeforeMethod

	public void SetUp() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(dataProvider = "Logindata")
	public void LoginTest(String User, String Pass, String Expected) throws InterruptedException {
		driver.get("https://admin-demo.nopcommerce.com/login");

		WebElement Username = driver.findElement(By.xpath("//input[@id=\"Email\"]"));
		Thread.sleep(2000);
		Username.clear();
		Thread.sleep(2000);
		Username.sendKeys(User);

		WebElement Password = driver.findElement(By.xpath("//input[@id=\"Password\"]"));
		Thread.sleep(2000);
		Password.clear();
		Thread.sleep(2000);
		Password.sendKeys(Pass);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		String Exp_Title = "Dashboard / nopCommerce administration";

		String Act_Title = driver.getTitle();

		if (Expected.equals("Valid")) {
			if (Exp_Title.equals(Act_Title)) {

				driver.findElement(By.linkText("Logout")).click();

				Assert.assertTrue(true); // true
			} else {
				Assert.assertTrue(false);

			}
		} else if (Expected.equals("Invalid")) {
			if (Exp_Title.equals(Act_Title)) {

				driver.findElement(By.linkText("logout")).click();

				Assert.assertTrue(false);
			} else {
				Assert.assertTrue(true);// pass

			}

		}
	}

	@DataProvider(name = "Logindata")
	public String[][] getData() {
		String logindata[][] = {

				{ "admin@yourstore.com", "admin", "Valid" }, { "admin@yourstore.com", "adm", "Invalid" },
				{ "admin@yoursto.com", "admin", "Invalid" }, { "admin@yoursto.com", "admn", "Invalid" },

		};
		return logindata;
	}

	@AfterMethod
	public void Teardown() {
		driver.quit();
	}

}