package Failed_XML;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class assertNotNull {
	WebDriver driver;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(CO);		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	}

	@Test(priority = 1)
	public void NewCustomer() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr472933");
//		driver.findElement(By.cssSelector("input[name=\"uid\"]")).sendKeys("mngr472933");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("UqEryra");
		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();

		driver.findElement(By.xpath("//a[text()=\"New Customer\"]")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[text()=\"New Customer\"]")).click();

		System.out.println(driver.findElement(By.xpath("//p[@class=\"heading3\"]")).getText());

		String obj1 = "obj1";
		Assert.assertNotNull(obj1);
		
		driver.findElement(By.xpath("//a[text()=\"Log out\"]")).click();
		driver.switchTo().alert().accept();
	}

	@Test(priority = 4)
	public void NewAccount() {
		driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr472933");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("UqEryra");
		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"New Account\"]")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[text()=\"New Account\"]")).click();

		System.out.println(driver.findElement(By.xpath("//p[@class=\"heading3\"]")).getText());

		String obj2 = "obj2";
		Assert.assertNotNull(obj2);

		driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("42233");
		driver.findElement(By.xpath("//input[@name=\"inideposit\"]")).sendKeys("3000");
		driver.findElement(By.xpath("//input[@name=\"button2\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Log out\"]")).click();
		driver.switchTo().alert().accept();
	}

//	@Test(priority = 2)
//	public void EditCustomer() throws InterruptedException {
//		driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr472933");
//		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("UqEryra");
//		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
//		driver.findElement(By.xpath("//a[text()=\"Edit Customer\"]")).click();
//		driver.navigate().refresh();
//		driver.findElement(By.xpath("//a[text()=\"Edit Customer\"]")).click();
//
//		System.out.println(driver.findElement(By.xpath("//p[@class=\"heading3\"]")).getText());
//
//		String obj3 = "obj3";
//		Assert.assertNotNull(obj3);
//
//		driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("42233");
//		driver.findElement(By.xpath("//input[@name=\"AccSubmit\"]")).click();
//		System.out.println(driver.findElement(By.xpath("//textarea[@name=\"addr\"]")).getText());
//		driver.findElement(By.xpath("//a[text()=\"Log out\"]")).click();
//		driver.switchTo().alert().accept();
//	}
//
//	@Test(priority = 3)
//	public void Deposit() {
//		driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr472933");
//		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("UqEryra");
//		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
//		driver.findElement(By.xpath("//a[text()=\"Deposit\"]")).click();
//		driver.navigate().refresh();
//		driver.findElement(By.xpath("//a[text()=\"Deposit\"]")).click();
//
//		System.out.println(driver.findElement(By.xpath("//p[@class=\"heading3\"]")).getText());
//
//		String obj4 = "obj4";
//		Assert.assertNotNull(obj4);
//
//		driver.findElement(By.xpath("//input[@name=\"accountno\"]")).sendKeys("42233");
//		driver.findElement(By.xpath("//input[@name=\"ammount\"]")).sendKeys("3000");
//		driver.findElement(By.xpath("//input[@name=\"desc\"]")).sendKeys("college fees");
//		driver.findElement(By.xpath("//input[@name=\"AccSubmit\"]")).click();
//		driver.switchTo().alert().accept();
//		driver.findElement(By.xpath("//a[text()=\"Log out\"]")).click();
//		driver.switchTo().alert().accept();
//	}

	@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}