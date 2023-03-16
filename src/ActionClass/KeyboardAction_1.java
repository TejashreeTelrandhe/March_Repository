package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		Thread.sleep(3000);

		Actions act = new Actions(driver);
		WebElement text1 = driver.findElement(By.id("inputText1"));
		WebElement text2 = driver.findElement(By.id("inputText2"));
		
		text1.sendKeys("Keyboard actions performed using action class");
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		Thread.sleep(3000);
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		Thread.sleep(3000);
		
		act.keyDown(Keys.TAB);
		act.build().perform();
		
		Thread.sleep(3000);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		System.out.println("Keyboard action performed successfully");
		Thread.sleep(5000);
		driver.quit();		
	}
}
