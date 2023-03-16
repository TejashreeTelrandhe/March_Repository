package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsAttribute {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://app.hubspot.com/login");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	System.out.println(driver.findElement(By.xpath("//label[contains(@id,\"UIFormControl-label-2\")]")).getText());
	driver.findElement(By.xpath("//input[contains(@id,\"username\")]")).sendKeys("tejashreetelrandhe1999@gmail.com");
	System.out.println(driver.findElement(By.xpath("//button[contains(@class,\"uiButton private-button private-button__link private-button--default\")]")).getText());
	driver.findElement(By.xpath("//input[contains(@id,\"password\")]")).sendKeys("tejashree99");
	System.out.println(driver.findElement(By.xpath("//footer[contains(@class,\"copyright\")]")).getText());
	driver.findElement(By.xpath("//div[contains(@data-test-id,\"remember-me\")]")).click();
	driver.findElement(By.xpath("//button[contains(@id,\"loginBtn\")]")).click();
	System.out.println("XpathByContainsAttribute");
	Thread.sleep(3000);
	driver.quit();
}
}
