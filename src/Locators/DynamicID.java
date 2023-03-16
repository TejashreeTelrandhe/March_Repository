package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicID {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("Tom@123");

		driver.findElement(By.id("pass")).sendKeys("2344");
		// By contains
		// driver.findElement(By.xpath("//button[contains(@id,\"u_0_5_\")]")).click();

		// starts - with
		driver.findElement(By.xpath("//button[starts-with(@id,\"u_0_5_\")]")).click();
	}

}