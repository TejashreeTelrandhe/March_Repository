package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame_WebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(3000);
		
		WebElement parent = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(parent);
		
		System.out.println(driver.findElement(By.xpath("//body[text()=\"Parent frame\"]")).getText());
		System.out.println();
		
		WebElement child = driver.findElement(By.xpath("//iframe[@srcdoc=\"<p>Child Iframe</p>\"]"));
		driver.switchTo().frame(child);
		
		System.out.println(driver.findElement(By.xpath("//p[text()=\"Child Iframe\"]")).getText());
		Thread.sleep(8000);
		driver.quit();
	}

}
