package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div/div/div/div//div/div[2]/div/div/form/div/div/input"))
				.sendKeys("1233");
		// Relative Xpath
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("1233");

		driver.findElement(By.xpath("/html/body/div/div/div/div//div/div[2]/div/div/form/div/div[2]/div/input"))
				.sendKeys("Test");

	}

}