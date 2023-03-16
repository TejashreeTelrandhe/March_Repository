package TestNG_Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExampleOfNormalTestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(CO);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/index.php");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		driver.findElement(By.name("uid")).sendKeys("mngr472933");
		driver.findElement(By.name("password")).sendKeys("UqEryra");
		driver.findElement(By.name("btnLogin")).click();
		
		System.out.println(driver.findElement(By.xpath("//marquee[@class=\"heading3\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//td[text()=\"Manger Id : mngr472933\"]")).getText());
		
		driver.findElement(By.xpath("//a[text()=\"Log out\"]")).click();
		driver.switchTo().alert().accept();
		driver.quit();
	}

}
