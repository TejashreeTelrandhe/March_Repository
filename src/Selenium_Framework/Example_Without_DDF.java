package Selenium_Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example_Without_DDF {

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
		driver.findElement(By.xpath("//a[text()=\"New Customer\"]")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[text()=\"New Customer\"]")).click();
		driver.findElement(By.name("name")).sendKeys("Tejashree Tulsidas Telrandhe");
		driver.findElement(By.xpath("(//input[@name=\"rad1\"])[2]")).click();
		driver.findElement(By.name("dob")).sendKeys("02");
		driver.findElement(By.name("dob")).sendKeys("08");
		driver.findElement(By.name("dob")).sendKeys("1999");
		driver.findElement(By.name("addr")).sendKeys("Mangalwari Peth, Milan Chawk, Umred");
		driver.findElement(By.name("city")).sendKeys("Nagpur");
		driver.findElement(By.name("state")).sendKeys("Maharashtra");
		driver.findElement(By.name("pinno")).sendKeys("441203");
		driver.findElement(By.name("telephoneno")).sendKeys("8999427533");
		driver.findElement(By.name("emailid")).sendKeys("telrandhe99@gmail.com");
		driver.findElement(By.name("password")).sendKeys("UqEryra");
		driver.findElement(By.name("sub")).click();
		
		Thread.sleep(5000);
		driver.quit();

	}

}
