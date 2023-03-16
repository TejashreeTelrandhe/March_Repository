package TestNGFeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testng_Test_case {

	@Test
	public void m1() {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
	}

	@Test
	public void m2() {
		System.out.println("Hello");
	}
}