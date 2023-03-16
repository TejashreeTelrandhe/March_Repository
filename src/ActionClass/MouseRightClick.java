package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");

		Thread.sleep(3000);

		WebElement Button = driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));

		Actions action = new Actions(driver);

		action.contextClick(Button).build().perform();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[contains(text(),'Copy')]")).click();
		Thread.sleep(3000);

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();

	}

}