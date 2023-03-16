package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/key_presses?");
		Thread.sleep(3000);

		System.out.println(driver.findElement(By.xpath("//div[@class=\"example\"]")).getText());
		Actions act = new Actions(driver);
		WebElement textbox = driver.findElement(By.id("target"));
		act.moveToElement(textbox).sendKeys(Keys.COMMAND).build().perform();
		System.out.println(driver.findElement(By.id("result")).getText());
		Thread.sleep(3000);

		act.moveToElement(textbox).sendKeys(Keys.ENTER).build().perform();
		System.out.println(driver.findElement(By.id("result")).getText());
		Thread.sleep(3000);

		act.moveToElement(textbox).sendKeys(Keys.ESCAPE).build().perform();
		System.out.println(driver.findElement(By.id("result")).getText());
		Thread.sleep(3000);

		act.moveToElement(textbox).sendKeys(Keys.TAB).build().perform();
		System.out.println(driver.findElement(By.id("result")).getText());
		Thread.sleep(3000);

		act.moveToElement(textbox).sendKeys(Keys.INSERT).build().perform();
		System.out.println(driver.findElement(By.id("result")).getText());
		Thread.sleep(3000);

		act.moveToElement(textbox).sendKeys(Keys.DELETE).build().perform();
		System.out.println(driver.findElement(By.id("result")).getText());
		Thread.sleep(3000);

		act.moveToElement(textbox).sendKeys(Keys.BACK_SPACE).build().perform();
		System.out.println(driver.findElement(By.id("result")).getText());
		Thread.sleep(3000);

		act.moveToElement(textbox).sendKeys(Keys.LEFT_ALT).build().perform();
		System.out.println(driver.findElement(By.id("result")).getText());
		Thread.sleep(9000);
		driver.quit();
	}

}
