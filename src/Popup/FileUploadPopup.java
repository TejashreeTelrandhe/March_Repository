package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(3000);
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Tejashree\\Pictures\\Screenshots\\Screenshot_20230219_052842.png");
		Thread.sleep(3000);
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//div[@class=\"example\"]")).getText());
		Thread.sleep(5000);
		driver.quit();
	}
}
