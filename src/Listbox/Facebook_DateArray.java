package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_DateArray {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();

		Thread.sleep(3000);
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		String dob = "2/2/1999";
		String date[] = dob.split("/");
		listbox(day, date[0]);
		Thread.sleep(3000);
		listbox(month, date[1]);
		Thread.sleep(3000);
		listbox(year, date[2]);
	}

	public static void listbox(WebElement element, String text) {
		Select s1 = new Select(element);
		s1.selectByValue(text);
	}
}
