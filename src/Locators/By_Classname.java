package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Classname {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
		driver.manage().window().maximize();

		System.out.println(driver.findElement(By.className("_9axz")).getText());
		driver.findElement(By.className("_xkt")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
