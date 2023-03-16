package PageObjectModel_Without_DDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Orange_HRM_Page1 OHP = new Orange_HRM_Page1(driver);

		OHP.UserName();
		Thread.sleep(2000);
		OHP.Pass();
		Thread.sleep(2000);
		OHP.LoginButton();

		Orange_HRM_Page2 OHP2 = new Orange_HRM_Page2(driver);
		OHP2.name();
		Thread.sleep(2000);
		OHP2.Time();

		Orange_HRM_Page3 OHP3 = new Orange_HRM_Page3(driver);
		OHP3.clock();
		Thread.sleep(3000);
		OHP3.note();
		
	}

}