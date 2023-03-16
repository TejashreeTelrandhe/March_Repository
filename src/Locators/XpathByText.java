package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//i18n-string[text()=\"Don't have an account?\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//i18n-string[text()=\"Sign up\"]")).getText());

		System.out.println(driver.findElement(By.xpath("//span[text()=\"Show Password\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//i18n-string[text()=\"Forgot my password\"]")).getText());

		System.out.println(driver.findElement(By.xpath("//i18n-string[text()=\"Log in\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//footer[text()=\" HubSpot, Inc.\"]")).getText());
		
		System.out.println("XpathByText");
		Thread.sleep(3000);
		driver.quit();
	}

}
