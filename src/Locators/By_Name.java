package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Name {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/index.php");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("uid")).sendKeys("mngr472933");
		driver.findElement(By.name("password")).sendKeys("UqEryra");
		driver.findElement(By.name("btnLogin")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
