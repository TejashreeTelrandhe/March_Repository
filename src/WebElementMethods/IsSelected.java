package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Register.html");

		Thread.sleep(3000);

		boolean b = driver.findElement(By.xpath("//input[@type=\"radio\"]")).isSelected();
		System.out.println(b);

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();

		boolean b1 = driver.findElement(By.xpath("//input[@type=\"radio\"]")).isSelected();
		System.out.println(b1);

	}

}