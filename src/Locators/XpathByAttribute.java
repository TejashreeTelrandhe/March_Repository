package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("tejashreetelrandhe1999@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("tejashree99");
		driver.findElement(By.xpath("//span[@id=\"checkbox-content-4\"]")).click();		
		driver.findElement(By.xpath("//button[@id=\"loginBtn\"]")).click();
		System.out.println("XpathByAttribute");
		Thread.sleep(3000);
		driver.quit();

	}

}
