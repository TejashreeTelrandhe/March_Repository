package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listbox1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Rahul");

		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Xyz");

		driver.findElement(By.xpath("//select[@id=\"day\"]")).click();

		driver.findElement(By.xpath("//option[@value=\"20\" and contains(text(),'20')]")).click();

		driver.findElement(By.id("month")).click();

		driver.findElement(By.xpath("//option[contains(text(),'Jun')]")).click();

		driver.findElement(By.id("year")).click();

		driver.findElement(By.xpath("//option[contains(text(),'2020')]")).click();

	}

}