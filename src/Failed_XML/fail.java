package Failed_XML;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class fail {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(CO);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		}
	
//	@Test (priority = 1)
//	public void Login() {
//		driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr472933");
//		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("UqEryra");
//		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
//
//		System.out.println(driver.findElement(By.xpath("//marquee[@class=\"heading3\"]")).getText());
//		System.out.println(driver.findElement(By.xpath("//td[text()=\"Manger Id : mngr472933\"]")).getText());
//		
//		driver.findElement(By.xpath("//a[text()=\"Log out\"]")).click();
//		driver.switchTo().alert().accept();
//	}
	
	@Test(priority = 4)
	public void NewCustomer() {
		driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr472933");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("UqEryra");
		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
		
		driver.findElement(By.xpath("//a[text()=\"New Customer\"]")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[text()=\"New Customer\"]")).click();
		
		System.out.println(driver.findElement(By.xpath("//p[@class=\"heading3\"]")).getText());
		
//		Assert.fail();
//		Assert.fail("Fails a test with the given message.");
		
		driver.findElement(By.xpath("//a[text()=\"Log out\"]")).click();
		driver.switchTo().alert().accept();
		
	}
	
//	@Test(priority = 2)
//	public void EditCustomer() {
//		driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr472933");
//		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("UqEryra");
//		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
//		
//		driver.findElement(By.xpath("//a[text()=\"Edit Customer\"]")).click();
//		driver.navigate().refresh();
//		driver.findElement(By.xpath("//a[text()=\"Edit Customer\"]")).click();
//		
//		System.out.println(driver.findElement(By.xpath("//p[@class=\"heading3\"]")).getText());
//		
//		driver.findElement(By.xpath("//a[text()=\"Log out\"]")).click();
//		driver.switchTo().alert().accept();
//	}
	
	@Test(priority = 3)
	public void CustomisedStatement() {
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
