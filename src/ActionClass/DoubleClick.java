package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");

		Thread.sleep(3000);

		WebElement Click = driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));

		Actions act = new Actions(driver);

		act.doubleClick(Click).build().perform();

		Thread.sleep(4000);

		driver.switchTo().alert().accept();

	}

}