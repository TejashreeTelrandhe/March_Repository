package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//i18n-string[contains(text(),\"Don't have an account?\")]")).getText());
		System.out.println(driver.findElement(By.xpath("//i18n-string[contains(text(),\"Sign up\")]")).getText());
		System.out.println(driver.findElement(By.xpath("//i18n-string[contains(text(),\"Log in with SSO\")]")).getText());

		System.out.println(driver.findElement(By.xpath("//span[contains(text(),\"Show Password\")]")).getText());
		System.out.println(driver.findElement(By.xpath("//i18n-string[contains(text(),\"Remember me\")]")).getText());
		System.out.println(driver.findElement(By.xpath("//i18n-string[contains(text(),\"Log in\")]")).getText());

		System.out.println("XpathByContainsText");
		Thread.sleep(5000);
		driver.quit();
	}

}
