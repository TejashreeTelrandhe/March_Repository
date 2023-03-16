package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_SelectObjectMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[text()=\"Sign up for Facebook\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.name("firstname")).sendKeys("Abhishek");
		driver.findElement(By.name("lastname")).sendKeys("Mudholkar");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("9326708637");
		driver.findElement(By.id("password_step_input")).sendKeys("oyeAbhya97");
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		selectmethod(day, "22");
		Thread.sleep(3000);
		selectmethod(month, "May");
		Thread.sleep(3000);
		selectmethod(year, "1996");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//label[text()=\"Male\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"Sign Up\"]")).click();
		Thread.sleep(9000);
		driver.quit();
	}

	public static void selectmethod(WebElement element, String text) {
		Select s1 = new Select(element);
		s1.selectByVisibleText(text);
	}

//	public static void selectmethod1(WebElement element1, String text1) {
//		Select s1 = new Select(element1);
//		s1.selectByValue(text1);
//	}
//
//	public static void selectmethod(WebElement element2, int i) {
//		Select s1 = new Select(element2);
//		s1.selectByIndex(0);
//	}
}
