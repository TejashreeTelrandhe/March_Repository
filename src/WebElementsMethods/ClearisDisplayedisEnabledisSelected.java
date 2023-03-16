package WebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearisDisplayedisEnabledisSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/index.php");

		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.name("uid")).sendKeys("mngr472933");
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.name("uid")).isDisplayed());

		driver.findElement(By.name("password")).sendKeys("UqEryrA");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("UqEryra");

		System.out.println(driver.findElement(By.name("btnLogin")).isEnabled());
		driver.findElement(By.name("btnLogin")).click();
		
		driver.findElement(By.xpath("//a[text()=\"New Customer\"]")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[text()=\"New Customer\"]")).click();
		
		System.out.println(driver.findElement(By.xpath("//input[@value=\"f\"]")).isSelected());
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//input[@value=\"m\"]")).isSelected());

		Thread.sleep(3000);
		driver.quit();
	}

}
