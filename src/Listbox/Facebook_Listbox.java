package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Listbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[text()=\"Sign up for Facebook\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.name("firstname")).sendKeys("Tejashree");
		driver.findElement(By.name("lastname")).sendKeys("Telrandhe");
		
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("9326708637");
		driver.findElement(By.id("password_step_input")).sendKeys("tejashree99");
		
		driver.findElement(By.id("day")).click();
		driver.findElement(By.xpath("//option[text()=\"8\"]")).click();
		
		driver.findElement(By.id("month")).click();
		driver.findElement(By.xpath("//option[text()=\"Feb\"]")).click();
		
		driver.findElement(By.id("year")).click();
		driver.findElement(By.xpath("//option[text()=\"1999\"]")).click();
		
		driver.findElement(By.xpath("//label[text()=\"Female\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"Sign Up\"]")).click();
		Thread.sleep(9000);
		driver.quit();
	}

}
