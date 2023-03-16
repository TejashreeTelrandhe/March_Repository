package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Dismiss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[text()=\"Confirm Alert Box\"]")).click();
		driver.switchTo().alert().dismiss();
		
		System.out.println("Cancel button clicked");
		System.out.println(driver.findElement(By.xpath("//p[text()=\"You clicked on Cancel!\"]")).getText());

		Thread.sleep(5000);
		driver.quit();
	}

}
