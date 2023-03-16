package WebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysClickGetText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		WebElement element = driver.findElement(By.xpath("//span[text()=\"Become a Seller\"]"));
		System.out.println(element.getText());
		driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("Mobiles");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("Books");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class=\"_1_3w1N\"]")).click();
		Thread.sleep(3000);
		
		driver.quit();
	}

}
