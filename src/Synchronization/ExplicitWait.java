package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("pass"));
		WebElement login = driver.findElement(By.name("login"));
		wait(driver,15,"tejashreetelrandhe1999@gmail.com", email);
		wait(driver, 10, "tejashree99", password);
		System.out.println(
				"new WebDriverWait (driver,Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOf(element)).sendKeys(value);");
		ClickWait(driver, 20, login);
		System.out.println(
				"new WebDriverWait(driver, Duration.ofSeconds(time)).until(ExpectedConditions.visibilityOf(element)).click();");
		Thread.sleep(3000);
		driver.quit();
	}

	public static void wait(WebDriver driver, int timeout, String value, WebElement element) {
		new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOf(element))
				.sendKeys(value);
	}

	public static void ClickWait(WebDriver driver, int time, WebElement element) {
		new WebDriverWait(driver, Duration.ofSeconds(time)).until(ExpectedConditions.visibilityOf(element)).click();
	}
}
