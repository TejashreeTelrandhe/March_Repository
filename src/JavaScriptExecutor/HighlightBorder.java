package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class HighlightBorder {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement Name = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		WebElement Login = driver.findElement(By.xpath("//button[@name=\"login\"]"));
		WebElement LPassword = driver.findElement(By.id("passContainer"));
		Thread.sleep(3000);

		Highlight(Name, driver);
		Highlight(Login, driver);
		Highlight(LPassword, driver);

//		   JavascriptExecutor Js = (JavascriptExecutor) driver;		   
//		   Js.executeScript("arguments[0].style.border ='10px solid red'", Name);

	}

	public static void Highlight(WebElement element, WebDriver driver) {

		JavascriptExecutor Js = (JavascriptExecutor) driver;

		Js.executeScript("arguments[0].style.border ='10px solid red'", element);

	}
}