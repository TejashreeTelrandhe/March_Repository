package CrossBrowserTesting;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {

	WebDriver driver;

	@Parameters("Browsername")
	@Test
	public void OrangHRMLogin(String Browsername) throws InterruptedException {

		if (Browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (Browsername.equals("IE")) {
			System.setProperty("webdriver.Ie.driver", "C:\\Installer\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else if (Browsername.equals("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Installer\\msedgedriver.exe");
			driver = new EdgeDriver();
		}

		else if (Browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Installer\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		String Expectedname = "Paul CollingsGera";
		String Actualname = driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();

		Thread.sleep(2000);

		if (Expectedname.equals(Actualname)) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		driver.quit();
	}

}