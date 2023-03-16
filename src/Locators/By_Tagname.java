package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Tagname {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/index.php");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.tagName("input")).sendKeys("mngr472933");
		System.out.println(driver.findElement(By.tagName("h2")).getText());
		System.out.println(driver.findElement(By.tagName("span")).getText());
		Thread.sleep(3000);
		driver.quit();
	}

}
