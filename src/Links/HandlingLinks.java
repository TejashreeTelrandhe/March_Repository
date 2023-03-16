package Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);

		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links = " + link.size());
//		1. Printing by for loop
		for (int i = 0; i < link.size(); i++) {
			System.out.println(link.get(i).getText());
			System.out.println(link.get(i).getAttribute("href"));
		}
		System.out.println("::::::::::::::::::::::::::::::::::::::::");
//		2. Printing by for each loop

		for (WebElement element : link) {
			System.out.println(element.getText());
			System.out.println(element.getAttribute("href"));
		}
	}

}
