package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
//		driver.get("http://username:password@the-internet.herokuapp.com/basic_auth");

		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//div[@class=\"example\"]")).getText());
		driver.quit();
	}

}
