package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// driver.get("https://login.yahoo.com/?.intl=in");
		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);

		// driver.findElement(By.className("phone-no")).sendKeys("123");
		driver.findElement(By.className("inputtext_55r1._6luy")).sendKeys("err");
	}

}