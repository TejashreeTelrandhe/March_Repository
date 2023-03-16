package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);

		// Tag and ID

		driver.findElement(By.cssSelector("#email")).sendKeys("1234");

		driver.findElement(By.cssSelector("#pass")).sendKeys("RRR");

		// Tag and attribute

		driver.findElement(By.cssSelector("input.inputtext[name=\"email\"]")).sendKeys("1333");
		driver.findElement(By.cssSelector("input.inputtext[class=\"inputtext _55r1 _6luy _9npi\"]")).sendKeys("333");
	}

}