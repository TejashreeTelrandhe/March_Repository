package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_ID {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("tejashreetelrandhe1999@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("tejashree99");
		driver.findElement(By.id("loginbutton")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
