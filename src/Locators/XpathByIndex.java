package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//a[@class=\"dropdown-toggle\"]")).getText());
		System.out.println(driver.findElement(By.xpath("(//a[@class=\"dropdown-toggle\"])[2]")).getText());

		System.out.println(driver.findElement(By.xpath("(//a[@class=\"dropdown-toggle\"])[3]")).getText());
		System.out.println(driver.findElement(By.xpath("(//li[@class=\"dropdown\"])[3]")).getText());
		
		System.out.println(driver.findElement(By.xpath("(//li[@class=\"dropdown\"])[4]")).getText());
		System.out.println(driver.findElement(By.xpath("(//li[@class=\"dropdown\"])[6]")).getText());

		System.out.println(driver.findElement(By.xpath("(//li[@class=\"dropdown\"])[8]")).getText());
		System.out.println(driver.findElement(By.xpath("(//li[@class=\"dropdown\"])[9]")).getText());
		
		System.out.println(driver.findElement(By.xpath("(//li[@class=\"dropdown\"])[10]")).getText());
		
		System.out.println("XpathByIndex");
		Thread.sleep(3000);
		driver.quit();
	}

}
