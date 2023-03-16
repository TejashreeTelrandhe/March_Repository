package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox5 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");

		Thread.sleep(3000);

		driver.findElement(By.id("src")).sendKeys("Pune");
		Thread.sleep(3000);

		List<WebElement> City = driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));

		System.out.println("Total Count :" + City.size());

		for (int i = 0; i < City.size(); i++) {
			City.get(i).getText();
			System.out.println(City.get(i).getText());
			if (City.get(i).getText().equals("Pimpri Chinchwad, Pune")) {
				System.out.println(City.get(i).getText());
				City.get(i).click();
				break;
			}
		}

		System.out.println();
		driver.findElement(By.id("dest")).sendKeys("Mumbai");
		Thread.sleep(3000);
		List<WebElement> DestCity = driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		System.out.println("Total count :" + DestCity.size());
		// 20
		for (int i = 0; i < DestCity.size(); i++) {
			if (DestCity.get(i).getText().equals("Nerul, Mumbai")) {
				System.out.println(DestCity.get(i).getText());
				DestCity.get(i).click();
			}
		}

		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@class=\"current day\"]")).click();
		driver.findElement(By.xpath("//button[@id=\"search_btn\"]")).click();
	}
}