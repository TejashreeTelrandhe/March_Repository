package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

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
		driver.findElement(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//li")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);

		act.contextClick(rightclickme).build().perform();
		System.out.println(
				driver.findElement(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//li[2]")).getText());
		driver.findElement(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//li[2]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);

		act.contextClick(rightclickme).build().perform();
		System.out.println(
				driver.findElement(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//li[3]")).getText());
		driver.findElement(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//li[3]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);

		act.contextClick(rightclickme).build().perform();
		System.out.println(
				driver.findElement(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//li[4]")).getText());
		driver.findElement(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//li[4]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);

		act.contextClick(rightclickme).build().perform();
		System.out.println(
				driver.findElement(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//li[5]")).getText());
		driver.findElement(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//li[5]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);

		act.contextClick(rightclickme).build().perform();
		System.out.println(
				driver.findElement(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//li[7]")).getText());
		driver.findElement(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//li[7]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.quit();
	}

}
