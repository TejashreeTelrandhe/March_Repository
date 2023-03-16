package TestNGFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Keywords {

	WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeMethod // 1 //4 //7
	public void SetUp() {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test // 2
	public void Logipage() {
		String Title = driver.getTitle();
		System.out.println(Title);
	}

	@Test // 5
	public void OrnagHRMLogo() {
		boolean b = driver.findElement(By.xpath("//div[@class=\"orangehrm-login-branding\"]")).isDisplayed();
		System.out.println(b);

	}

	@Test // 8
	public void forgetpassword() {
		driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]")).click();
	}

	@AfterMethod
	public void Teardown() throws InterruptedException { // 3 //6 //9
		Thread.sleep(3000);
		driver.quit();
	}
}