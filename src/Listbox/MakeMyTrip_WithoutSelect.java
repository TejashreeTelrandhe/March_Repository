package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip_WithoutSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/bus-tickets/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(3000);
		List<WebElement> from = driver
				.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]//li"));
		System.out.println("options available from destination = " + from.size());
		for (int i = 0; i < from.size(); i++) {
			System.out.println(from.get(i).getText());
			if (from.get(i).getText().equals("Hyderabad, Telangana")) {
				System.out.println(from.get(i).getText());
				from.get(i).click();
				break;
			}
		}
		System.out.println();

		Thread.sleep(3000);

//		driver.findElement(By.id("toCity")).click();
		WebElement element = driver.findElement(By.id("toCity"));
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("arguments[0].click()", element);
		Thread.sleep(3000);

		List<WebElement> to = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]//li"));
		System.out.println("options available to destination = " + to.size());
		for (int i = 0; i < to.size(); i++) {
			System.out.println(to.get(i).getText());
			if (to.get(i).getText().equals("Pune, Maharashtra")) {
				System.out.println(to.get(i).getText());
				to.get(i).click();
				break;
			}
		}

//		driver.findElement(By.id("travelDate")).click();
		WebElement date = driver.findElement(By.id("travelDate"));
		JS.executeScript("arguments[0].click()", date);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[text()=\"10\"])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("search_button")).click();

	}

}
