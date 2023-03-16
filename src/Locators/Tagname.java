package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		Thread.sleep(4000);
		driver.findElement(By.tagName("input")).sendKeys("R@123");
		
		driver.findElement(By.tagName("input")).sendKeys("R1233");
}

}