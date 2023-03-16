package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIframe1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

		Thread.sleep(3000);

		driver.switchTo().frame("iframeResult");

		driver.findElement(By.xpath("//button[contains(text(),'Click me to display Date and Time.')]")).click();

		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//a[@id=\"tryhome\"]")).click();
	}

}
