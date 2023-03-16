package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_LinkText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
		driver.manage().window().maximize();

		System.out.println(driver.findElement(By.linkText("Forgotten account?")).getText());
		
		System.out.println(driver.findElement(By.linkText("Sign up for Facebook")).getText());
	
		Thread.sleep(3000);
		driver.quit();
	}

}
