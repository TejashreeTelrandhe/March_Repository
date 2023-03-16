package Guru99_BaseClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Guru99_Configuration.Read_Configuration;
import Guru99_Utilities.TestUtil;
import net.bytebuddy.utility.RandomString;

public class Base_Class {
	Read_Configuration RC = new Read_Configuration();
	public String Url = RC.getAppURL();
	public String User = RC.getAppUser();
	public String Pass = RC.getAppPass();
	public String Chrome = RC.getAppChrome();
	public String Firefox = RC.getAppFirefox();
	public String Edge = RC.getAppEdge();
	public String IE = RC.getAppIE();
	public static WebDriver driver;
	public static Logger logger;

	@Parameters("browser")
	@BeforeMethod
	public void initialize(String browser) {
		logger = Logger.getLogger("DDF Framework");
		PropertyConfigurator.configure("log4j.properties");

		if (browser.equals("chrome")) {
			ChromeOptions CO = new ChromeOptions();
			CO.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(CO);
			System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		} else if (browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Installer\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Installer\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Installer\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PageLoadTimeout));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.ImplicitWait));
		driver.get(Url);
	}

	public void getScreenshotAs(String testcasename) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String random = RandomString.make(4);
		File dest = new File("C:\\Users\\Tejashree\\eclipse-workspace\\Framework_Guru99\\Screenshots\\" + testcasename
				+ "" + random + ".png");
		FileHandler.copy(src, dest);
	}

	@AfterMethod
	public void shutdown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
