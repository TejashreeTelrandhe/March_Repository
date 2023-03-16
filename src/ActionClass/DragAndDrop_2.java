package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(3000);

		Actions act = new Actions(driver);
		WebElement drag1 = driver.findElement(By.id("box1"));
		WebElement drop1 = driver.findElement(By.id("box104"));
		act.dragAndDrop(drag1, drop1).build().perform();
		Thread.sleep(3000);
		
		WebElement drag2 = driver.findElement(By.id("box2"));
		WebElement drop2 = driver.findElement(By.id("box103"));
		act.dragAndDrop(drag2, drop2).build().perform();
		Thread.sleep(3000);
		
		WebElement drag3 = driver.findElement(By.id("box3"));
		WebElement drop3 = driver.findElement(By.id("box107"));
		act.dragAndDrop(drag3, drop3).build().perform();
		Thread.sleep(3000);
		
		WebElement drag4 = driver.findElement(By.id("box4"));
		WebElement drop4 = driver.findElement(By.id("box102"));
		act.dragAndDrop(drag4, drop4).build().perform();
		Thread.sleep(3000);
		
		WebElement drag5 = driver.findElement(By.id("box5"));
		WebElement drop5 = driver.findElement(By.id("box106"));
		act.dragAndDrop(drag5, drop5).build().perform();
		Thread.sleep(3000);
		
		WebElement drag6 = driver.findElement(By.id("box6"));
		WebElement drop6 = driver.findElement(By.id("box101"));
		act.dragAndDrop(drag6, drop6).build().perform();
		Thread.sleep(3000);
		
		WebElement drag7 = driver.findElement(By.id("box7"));
		WebElement drop7 = driver.findElement(By.id("box105"));
		act.dragAndDrop(drag7, drop7).build().perform();
		Thread.sleep(3000);
		
		driver.close();
	}

}
