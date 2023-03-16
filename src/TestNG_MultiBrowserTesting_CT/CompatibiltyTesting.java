package TestNG_MultiBrowserTesting_CT;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CompatibiltyTesting {
	WebDriver driver;
	@Parameters("Browsername")
	@Test
	public void CustomisedStatement(String Browsername) throws InterruptedException  {
		if (Browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
			ChromeOptions CO = new ChromeOptions();
			CO.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(CO);		} 
		else if (Browsername.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Installer\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else if (Browsername.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Installer\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else if (Browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Installer\\geckodriver.exe");
			driver = new FirefoxDriver();
		} 
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

	
		driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr472933");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("UqEryra");
		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=\"Customised Statement\"]")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[text()=\"Customised Statement\"]")).click();

		System.out.println(driver.findElement(By.xpath("//p[@class=\"heading3\"]")).getText());

		driver.findElement(By.xpath("//a[text()=\"Log out\"]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.quit();
	}
}
		
//		WebDriver driver;
//
//		@Parameters("Browsername")
//		@BeforeMethod
//
//		public void setup(String Browsername) {
//			if (Browsername.equals("chrome")) {
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
//				driver = new ChromeDriver();
//			} 
//			else if (Browsername.equals("ie")) {
//				System.setProperty("webdriver.ie.driver", "C:\\Installer\\IEDriverServer.exe");
//				driver = new InternetExplorerDriver();
//			}
//			else if (Browsername.equals("edge")) {
//				System.setProperty("webdriver.edge.driver", "C:\\Installer\\msedgedriver.exe");
//
//				driver = new EdgeDriver();
//			}
//			else if (Browsername.equals("firefox")) {
//				System.setProperty("webdriver.gecko.driver", "C:\\Installer\\geckodriver.exe");
//				driver = new FirefoxDriver();
//			} 
//			
//			driver.manage().window().maximize();
//			driver.get("https://demo.guru99.com/v4/index.php");
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
//		}
//
//		@Test
//		public void NewAccount() throws InterruptedException {
//			driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr472933");
//			driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("UqEryra");
//			driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//a[text()=\"New Account\"]")).click();
//			driver.navigate().refresh();
//			driver.findElement(By.xpath("//a[text()=\"New Account\"]")).click();
//
//
//			String title2 = "Guru99 bank add new account";
//			Assert.assertEquals(title2, driver.getTitle());
//			System.out.println(driver.getTitle());
//
//			driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("42233");
//			driver.findElement(By.xpath("//input[@name=\"inideposit\"]")).sendKeys("3000");
//			driver.findElement(By.xpath("//input[@name=\"button2\"]")).click();
//			driver.findElement(By.xpath("//a[text()=\"Log out\"]")).click();
//			driver.switchTo().alert().accept();
//		}
//
//		@Test
//		public void EditCustomer() throws InterruptedException {
//			driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr472933");
//			driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("UqEryra");
//			driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//a[text()=\"Edit Customer\"]")).click();
//			driver.navigate().refresh();
//			driver.findElement(By.xpath("//a[text()=\"Edit Customer\"]")).click();
//
//			System.out.println(driver.findElement(By.xpath("//p[@class=\"heading3\"]")).getText());
//
//			String title3 = "Guru99 Bank Edit Customer Page";
//			Assert.assertEquals(title3, driver.getTitle());
//			System.out.println(driver.getTitle());
//
//			driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("42233");
//			driver.findElement(By.xpath("//input[@name=\"AccSubmit\"]")).click();
//			System.out.println(driver.findElement(By.xpath("//textarea[@name=\"addr\"]")).getText());
//			driver.findElement(By.xpath("//a[text()=\"Log out\"]")).click();
//			driver.switchTo().alert().accept();
//			Thread.sleep(3000);
//		}
//
//		@Test
//		public void Deposit() throws InterruptedException {
//			driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr472933");
//			driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("UqEryra");
//			driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//a[text()=\"Deposit\"]")).click();
//			driver.navigate().refresh();
//			driver.findElement(By.xpath("//a[text()=\"Deposit\"]")).click();
//
//			System.out.println(driver.findElement(By.xpath("//p[@class=\"heading3\"]")).getText());
//
//			String title4 = "Guru99 Bank Amount Deposit Page";
//			Assert.assertEquals(title4, driver.getTitle());
//			System.out.println(driver.getTitle());
//
//			driver.findElement(By.xpath("//input[@name=\"accountno\"]")).sendKeys("42233");
//			driver.findElement(By.xpath("//input[@name=\"ammount\"]")).sendKeys("3000");
//			driver.findElement(By.xpath("//input[@name=\"desc\"]")).sendKeys("college fees");
//			driver.findElement(By.xpath("//input[@name=\"AccSubmit\"]")).click();
//			driver.switchTo().alert().accept();
//			driver.findElement(By.xpath("//a[text()=\"Log out\"]")).click();
//			driver.switchTo().alert().accept();
//		}
//
//		@Test
//		public void CustomisedStatement() throws InterruptedException {
//			driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr472933");
//			driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("UqEryra");
//			driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//a[text()=\"Customised Statement\"]")).click();
//			driver.navigate().refresh();
//			driver.findElement(By.xpath("//a[text()=\"Customised Statement\"]")).click();
//
//			System.out.println(driver.findElement(By.xpath("//p[@class=\"heading3\"]")).getText());
//
//			driver.findElement(By.xpath("//a[text()=\"Log out\"]")).click();
//			driver.switchTo().alert().accept();
//		}
//
//		@AfterMethod
//		public void teardown() throws InterruptedException {
//			Thread.sleep(3000);
//			driver.quit();
//	}
//}
