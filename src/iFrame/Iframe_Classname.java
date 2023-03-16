package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Classname {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");
		Thread.sleep(3000);
				
		driver.switchTo().frame("iamframe");
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("topic")).getText());
		driver.findElement(By.tagName("input")).sendKeys("Frame 1");
		
		driver.switchTo().frame("frame3");
		System.out.println(driver.findElement(By.xpath("//b[text()=\"Inner Frame Check box :\"]")).getText());
		driver.findElement(By.id("a")).click();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame("frame2");
		System.out.println(driver.findElement(By.xpath("//b[text()=\"Animals :\"]")).getText());
		driver.findElement(By.xpath("//select[@id=\"animals\"]//option[2]")).click();		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
