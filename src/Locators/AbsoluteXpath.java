package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/button[2]")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div/i18n-string")).getText());
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div/div/div/div[2]/input"))
				.sendKeys("tejashreetelrandhe1999@gmail.com");
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("/html/body/div/div/div[2]/form/div[3]/a/i18n-string")).getText());
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/button")).click();
		System.out.println("AbsoluteXpath");
		Thread.sleep(3000);
		driver.quit();
	}

}
