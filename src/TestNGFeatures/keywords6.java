package TestNGFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class keywords6 {
	WebDriver driver;

	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		// Question -how will u execute test cases in a sequence manner - using priority
		// keyword
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test(groups = "Title")
	public void Logipage() {
		String Title = driver.getTitle();
		System.out.println(Title);
		System.out.println("Test4");
	}

	@Test(groups = "LogoTest")
	public void OrnagHRMLogo() {
		boolean b = driver.findElement(By.xpath("//div[@class=\"orangehrm-login-branding\"]")).isDisplayed();
		System.out.println(b);
		System.out.println("Test5");
	}

	@Test(groups = "Title")
	public void A() {
		driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]")).click();
		System.out.println("Test6");
	}

	@Test(groups = "LogoTest")
	public void test1() {
		System.out.println("Test3");
	}

	@Test(groups = "LogoTest")
	public void test2() {
		System.out.println("Test2");
	}

	@Test(groups = "Title")
	public void test3() {
		System.out.println("Test1");
	}

	@AfterMethod
	public void Teardown() throws InterruptedException { // 3 //6 //9
		Thread.sleep(3000);
		driver.quit();
	}
}