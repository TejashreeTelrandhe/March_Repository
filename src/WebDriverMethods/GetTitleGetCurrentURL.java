package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleGetCurrentURL {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/coding-interview-questions-article");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		System.out.println("Title of page : " + driver.getTitle());
		Thread.sleep(3000);
		System.out.println("URL : " + driver.getCurrentUrl());
		
		driver.quit();
	}

}
