package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyContains {

	public static void main(String[] args) {

		// Contains by attribute
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("QWERTY");

		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("2345");

		driver.findElement(By.xpath("//a[contains(text(),\"password?\")]")).click();

		driver.findElement(By.xpath("//a[contains(text(),\"Forgotten passwor\")]")).click();
	}

}