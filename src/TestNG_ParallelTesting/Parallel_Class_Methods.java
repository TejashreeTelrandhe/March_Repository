package TestNG_ParallelTesting;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Parallel_Class_Methods {
	WebDriver driver;

	@BeforeMethod
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
	public void NewCustomer() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr472933");
//	driver.findElement(By.cssSelector("input[name=\"uid\"]")).sendKeys("mngr472933");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("UqEryra");
		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();

		driver.findElement(By.xpath("//a[text()=\"New Customer\"]")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[text()=\"New Customer\"]")).click();

		System.out.println(driver.findElement(By.xpath("//p[@class=\"heading3\"]")).getText());

		String title1 = "Guru99 Bank New Customer Entry Page";
		Assert.assertEquals(title1, driver.getTitle());
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//a[text()=\"Log out\"]")).click();
		driver.switchTo().alert().accept();
	}
	@Test
	public void NewAccount() {
		driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr472933");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("UqEryra");
		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"New Account\"]")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[text()=\"New Account\"]")).click();

		System.out.println(driver.findElement(By.xpath("//p[@class=\"heading3\"]")).getText());

		String title2 = "Guru99 bank add new account";
//	String title2 ="Guru99 bank add new";
		Assert.assertEquals(title2, driver.getTitle());
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("42233");
		driver.findElement(By.xpath("//input[@name=\"inideposit\"]")).sendKeys("3000");
		driver.findElement(By.xpath("//input[@name=\"button2\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Log out\"]")).click();
		driver.switchTo().alert().accept();
	}
	@Test
	public void EditCustomer() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr472933");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("UqEryra");
		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Edit Customer\"]")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[text()=\"Edit Customer\"]")).click();

		System.out.println(driver.findElement(By.xpath("//p[@class=\"heading3\"]")).getText());

		String title3 = "Guru99 Bank Edit Customer Page";
		Assert.assertEquals(title3, driver.getTitle());
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("42233");
		driver.findElement(By.xpath("//input[@name=\"AccSubmit\"]")).click();
		System.out.println(driver.findElement(By.xpath("//textarea[@name=\"addr\"]")).getText());
		driver.findElement(By.xpath("//a[text()=\"Log out\"]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}
	@Test
	public void Deposit() {
		driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr472933");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("UqEryra");
		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Deposit\"]")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[text()=\"Deposit\"]")).click();

		System.out.println(driver.findElement(By.xpath("//p[@class=\"heading3\"]")).getText());

		String title4 = "Guru99 Bank Amount Deposit Page";
		Assert.assertEquals(title4, driver.getTitle());
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//input[@name=\"accountno\"]")).sendKeys("42233");
		driver.findElement(By.xpath("//input[@name=\"ammount\"]")).sendKeys("3000");
		driver.findElement(By.xpath("//input[@name=\"desc\"]")).sendKeys("college fees");
		driver.findElement(By.xpath("//input[@name=\"AccSubmit\"]")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//a[text()=\"Log out\"]")).click();
		driver.switchTo().alert().accept();
	}

	@Test
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

	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
