package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector1 {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
			
			System.setProperty("webdriver.chrome.driver", "chromedriver");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
		    driver.get("https://app.hubspot.com/");
			Thread.sleep(3000);
				
//			driver.findElement(By.cssSelector("#username")).sendKeys("Trest234");
//			Thread.sleep(3000);
//			driver.findElement(By.cssSelector("#password")).sendKeys("QWER");
//			
//			driver.findElement(By.cssSelector("input#username")).sendKeys("Trest234");
//			Thread.sleep(3000);
//			driver.findElement(By.cssSelector("input#password")).sendKeys("QWER");
//			
			
			driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("Rdkendre@gmail.com");
			driver.findElement(By.cssSelector("input.form-control.private-form__control.login-password.m-bottom-3")).sendKeys("224444444444");
			driver.findElement(By.cssSelector("span.UICheckbox_PrivateCheckboxIcon-uhzinu-4.jAKzDQ.private-checkbox_dash")).click();
			driver.findElement(By.cssSelector("#loginBtn")).click();
			
	}

}