package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		Thread.sleep(3000);

		// Scrolldown/up by pixcel
		JavascriptExecutor Js = (JavascriptExecutor) driver;

//			Js.executeScript("window.scrollBy(0,4000)", "");
//			Thread.sleep(3000);
//			Js.executeScript("window.scrollBy(0,-3000)", "");

		// ScrollDwonUp till bottom/up

		Js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");

		Thread.sleep(3000);
		Js.executeScript("document.documentElement.scrollTop=0", "");
	}

}