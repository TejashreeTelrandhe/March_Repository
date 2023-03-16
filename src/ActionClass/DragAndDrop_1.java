package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Static.html");
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		WebElement drag1 = driver.findElement(By.xpath("//img[@id=\"angular\"]"));
		WebElement drop1 = driver.findElement(By.id("droparea"));
		act.dragAndDrop(drag1, drop1).build().perform();
		System.out.println("First image drag and dropped");
		Thread.sleep(3000);
		
		WebElement drag2 = driver.findElement(By.xpath("//img[@id=\"mongo\"]"));
		WebElement drop2 = driver.findElement(By.id("droparea"));
		act.dragAndDrop(drag2, drop2).build().perform();
		System.out.println("Second image drag and dropped");
		Thread.sleep(3000);
		
		WebElement drag3 = driver.findElement(By.xpath("//img[@id=\"node\"]"));
		WebElement drop3 = driver.findElement(By.id("droparea"));
		act.dragAndDrop(drag3, drop3).build().perform();
		System.out.println("Third image drag and dropped");
		Thread.sleep(3000);
		driver.quit();
	}

}
