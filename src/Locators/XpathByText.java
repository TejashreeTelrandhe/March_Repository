package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("QWERTY");

		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("2345");

		// driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Forgotten passwor?\"]")).click();
	}

}