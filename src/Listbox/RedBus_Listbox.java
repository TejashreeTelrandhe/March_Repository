package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus_Listbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);

		driver.findElement(By.id("src")).sendKeys("Pune");
		Thread.sleep(3000);

		List<WebElement> src = driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		System.out.println("Length of options in src : " + src.size());

		for (int i = 0; i < src.size(); i++) {
			System.out.println(src.get(i).getText());
			if (src.get(i).getText().equals("Viman Nagar, Pune")) {
				System.out.println(src.get(i).getText());
				src.get(i).click();
				break;
			}
		}
		System.out.println("source selected");
		System.out.println();

		driver.findElement(By.id("dest")).sendKeys("Mumbai");
		Thread.sleep(3000);

		List<WebElement> dest = driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		System.out.println("Length of options in dest : " + dest.size());

		for (int i = 0; i < dest.size(); i++) {
			System.out.println(dest.get(i).getText());
			if (dest.get(i).getText().equals("Sion, Mumbai")) {
				System.out.println(dest.get(i).getText());
				dest.get(i).click();
				break;
			}
		}
		System.out.println("destination selected");
		System.out.println();

		driver.findElement(By.id("onward_cal")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[@class=\"next\"]")).click();
		driver.findElement(By.xpath("//td[text()=\"6\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("search_btn")).click();
	}

}
