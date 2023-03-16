package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Select_Object3 {

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
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		Select s1 = new Select(day);
		s1.selectByVisibleText("8");
		Thread.sleep(2000);

		Select s2 = new Select(month);
		s2.selectByValue("2");
		Thread.sleep(2000);

		Select s3 = new Select(year);
		s3.selectByIndex(24);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[text()=\"Female\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"Sign Up\"]")).click();
		Thread.sleep(9000);
		driver.quit();
	}

}
