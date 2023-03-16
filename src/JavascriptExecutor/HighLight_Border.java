package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighLight_Border {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		Thread.sleep(3000);

		JavascriptExecutor JS = (JavascriptExecutor) driver;
		WebElement text1 = driver.findElement(By.id("inputText1"));
		JS.executeScript("arguments[0].style.border = '3px solid red'", text1);
		Thread.sleep(3000);

		WebElement text2 = driver.findElement(By.id("inputText2"));
		JS.executeScript("arguments[0].style.border = '3px solid orange'", text2);
		Thread.sleep(3000);

		WebElement Edittext = driver.findElement(By.xpath("//button[text()=\"Edit texts ...\"]"));
		JS.executeScript("arguments[0].style.border = '5px solid blue'", Edittext);
		Thread.sleep(3000);

		WebElement Switchtext = driver.findElement(By.xpath("//button[text()=\"Switch texts\"]"));
		JS.executeScript("arguments[0].style.border = '6px solid yellow'", Switchtext);
		Thread.sleep(3000);

		WebElement clearall = driver.findElement(By.xpath("(//button[text()=\"Clear all\"])[2]"));
		JS.executeScript("arguments[0].style.border = '2px solid green'", clearall);
		Thread.sleep(8000);
		driver.quit();
	}

}
