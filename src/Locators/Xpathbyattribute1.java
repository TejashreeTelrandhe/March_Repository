package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbyattribute1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("QWERTY");

		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("2345");

		driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]")).click();

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

}