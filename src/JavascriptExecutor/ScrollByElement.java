package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);

		JavascriptExecutor JS = (JavascriptExecutor) driver;
		System.out.println(driver.findElement(By.xpath("//a[text()=\"Sell under Amazon Accelerator\"]")).getText());
		WebElement element1 = driver.findElement(By.xpath("//a[text()=\"Sell under Amazon Accelerator\"]"));
		JS.executeScript("arguments[0].scrollIntoView();", element1);
		Thread.sleep(3000);

		System.out.println(driver
				.findElement(By.xpath("//h2[text()=\"Home appliances | Up to 10% off on select cards\"]")).getText());
		WebElement element2 = driver
				.findElement(By.xpath("//h2[text()=\"Home appliances | Up to 10% off on select cards\"]"));
		JS.executeScript("arguments[0].scrollIntoView();", element2);
		Thread.sleep(3000);

		System.out.println(driver.findElement(By.xpath("(//li[@class=\"nav_first\"])[6]")).getText());
		WebElement element3 = driver.findElement(By.xpath("(//li[@class=\"nav_first\"])[6]"));
		JS.executeScript("arguments[0].scrollIntoView();", element3);
		Thread.sleep(3000);

		System.out.println(driver.findElement(By.xpath("//span[text()=\"& Orders\"]")).getText());
		WebElement element4 = driver.findElement(By.xpath("//span[text()=\"& Orders\"]"));
		JS.executeScript("arguments[0].scrollIntoView();", element4);
		Thread.sleep(8000);
		driver.quit();
	}

}
