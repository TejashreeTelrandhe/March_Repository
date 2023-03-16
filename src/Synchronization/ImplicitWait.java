package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		System.out.println(driver.findElement(By.xpath("//span[text()=\"Become a Seller\"]")).getText());
		System.out.println();
		
		System.out.println(driver.findElement(By.xpath("//div[text()=\"Mobiles\"]")).getText());
		System.out.println();
		
		System.out.println(driver.findElement(By.xpath("//div[text()=\"Home\"]")).getText());
		System.out.println();
		
		System.out.println(driver.findElement(By.xpath("//div[text()=\"Two Wheelers\"]")).getText());
		System.out.println();
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		WebElement click = driver.findElement(By.xpath("//a[text()=\"Lenovo Laptops\"]"));
		JS.executeScript("arguments[0].click()", click);
//		driver.findElement(By.xpath("//a[text()=\"Lenovo Laptops\"]")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class=\"_3Il5oO dwRsDN\"]")).getText());
		System.out.println();
		
		System.out.println(driver.findElement(By.xpath("//div[@class=\"_1D76KH\"]")).getText());
		System.out.println();
		
		System.out.println(driver.findElement(By.xpath("//div[@class=\"_5THWM1\"]")).getText());
		Thread.sleep(5000);
		driver.quit();
	}
}
