package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(3000);

		Actions act = new Actions(driver);
		WebElement rightclickme = driver.findElement(By.xpath("//span[text()=\"right click me\"]"));
		act.moveToElement(rightclickme).contextClick().build().perform();
		System.out.println(
				driver.findElement(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//li")).getText());
		WebElement Edit = driver.findElement(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//li"));
		act.moveToElement(Edit).click().build().perform();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);

		act.contextClick(rightclickme).build().perform();
		System.out.println(
				driver.findElement(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//li[2]")).getText());
		WebElement Cut = driver.findElement(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//li[2]"));
		act.moveToElement(Cut).click().build().perform();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);

		act.contextClick(rightclickme).build().perform();
		System.out.println(
				driver.findElement(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//li[3]")).getText());
		WebElement Copy = driver.findElement(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//li[3]"));
		act.moveToElement(Copy).click().build().perform();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);

		act.contextClick(rightclickme).build().perform();
		System.out.println(
				driver.findElement(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//li[4]")).getText());
		WebElement  Paste = driver.findElement(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//li[4]"));
		act.moveToElement(Paste).click().build().perform();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);

		act.contextClick(rightclickme).build().perform();
		System.out.println(
				driver.findElement(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//li[5]")).getText());
		WebElement Delete = driver.findElement(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//li[5]"));
		act.moveToElement(Delete).click().build().perform();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);

		act.contextClick(rightclickme).build().perform();
		System.out.println(
				driver.findElement(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//li[7]")).getText());
		WebElement Quit = driver.findElement(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//li[7]"));
		act.moveToElement(Quit).click().build().perform();
		driver.switchTo().alert().accept();
		Thread.sleep(8000);
		driver.quit();

	}

}
