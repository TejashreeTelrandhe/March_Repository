package TestNGFeatures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class dependsOnMethodKeyword {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(CO);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		}
	
	@Test 
	public void test1() {
		driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr472933");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("UqEryra");
		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();

		System.out.println(driver.findElement(By.xpath("//marquee[@class=\"heading3\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//td[text()=\"Manger Id : mngr472933\"]")).getText());
		driver.findElement(By.xpath("//a[text()=\"Log out\"]")).click();
		driver.switchTo().alert().accept();
	}
	
	@Test(dependsOnMethods = "test1")
	public void test2() {
		driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr472933");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("UqEryra");
		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
		
		driver.findElement(By.xpath("//a[text()=\"New Customer\"]")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[text()=\"New Customer\"]")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class=\"heading3\"]")).getText());
		driver.findElement(By.xpath("//a[text()=\"Log out\"]")).click();
		driver.switchTo().alert().accept();
	}
	
	@Test(dependsOnMethods = "test1")
	public void test3() {
		driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr472933");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("UqEryra");
		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
		
		driver.findElement(By.xpath("//a[text()=\"Edit Customer\"]")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[text()=\"Edit Customer\"]")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class=\"heading3\"]")).getText());
		driver.findElement(By.xpath("//a[text()=\"Log out\"]")).click();
		driver.switchTo().alert().accept();
	}
	
	@Test(dependsOnMethods = "test1")
	public void test4() {
		driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr472933");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("UqEryra");
		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
		
		driver.findElement(By.xpath("//a[text()=\"Customised Statement\"]")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[text()=\"Customised Statement\"]")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class=\"heading3\"]")).getText());
		driver.findElement(By.xpath("//a[text()=\"Log out\"]")).click();
		driver.switchTo().alert().accept();
	}
	
	@AfterClass
	public void teardown() throws InterruptedException {
//		Thread.sleep(3000);
		driver.quit();
}
}