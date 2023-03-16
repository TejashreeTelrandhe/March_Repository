package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptSendkeys {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Thread.sleep(4000);

		WebElement Username = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		WebElement Password = driver.findElement(By.xpath("//input[@id=\"pass\"]"));

		JavascriptExecutor Js = (JavascriptExecutor) driver;

		WebElement Click = driver.findElement(By.xpath("//button[@name=\"login\"]"));

		// Firstway
//			Js.executeScript("arguments[0].value='JavaTest';", Username);
//			
//			Js.executeScript("arguments[0].value='@#$%';", Password);
//			
//			Js.executeScript("arguments[0].click()", Click);

		// SecondWay

		Js.executeScript("document.getElementById('email').value='Java';");
		Js.executeScript("document.getElementById('pass').value='$%^&';");

		Js.executeScript("arguments[0].click()", Click);

	}

}