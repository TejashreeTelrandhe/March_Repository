package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,\"signup-link\")]")).getText());
		System.out.println(driver.findElement(By.xpath("//i18n-string[contains(text(),\"Privacy Policy\")]")).getText());

		driver.findElement(By.xpath("//button[@id=\"ssoBtn\"]")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//i18n-string[text()=\"Log in with your single sign-on credentials\"]")).getText());
		System.out.println("RelativeXpath");
		Thread.sleep(5000);
		driver.quit();
	}

}
