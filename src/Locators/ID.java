package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("Tom@123");

		driver.findElement(By.id("pass")).sendKeys("2344");

		// driver.findElement(By.id("u_0_5_Qq")).click();
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
	}

}