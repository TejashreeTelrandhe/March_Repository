package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingByelement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/");

		Thread.sleep(3000);

		WebElement Code = driver.findElement(By.xpath("//h1[contains(text(),'W3Schools Spaces')]"));

		JavascriptExecutor Js = (JavascriptExecutor) driver;

		Thread.sleep(3000);

		Js.executeScript("arguments[0].scrollIntoView();", Code);
	}

}