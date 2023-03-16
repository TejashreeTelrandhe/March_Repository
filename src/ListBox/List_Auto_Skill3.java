package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List_Auto_Skill3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//select[@id=\"Skills\"]")).sendKeys("APIs");
		Thread.sleep(2000);

		List<WebElement> skills = driver.findElements(By.xpath("//select[@id=\"Skills\"]//option"));

		System.out.println(skills.size());

		driver.close();

	}
}