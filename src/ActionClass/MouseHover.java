package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwaretestingmaterial.com/oops-concept-in-automation-framework/");
		Thread.sleep(3000);

		Actions act = new Actions(driver);
		WebElement Tutorials = driver.findElement(By.xpath("//span[text()=\"Tutorials\"]"));
		act.moveToElement(Tutorials).build().perform();
		System.out.println(driver.findElement(By.xpath("//ul[@class=\"sub-menu\"]")).getText());
		System.out.println("Mouse moved over Tutorials");
		Thread.sleep(3000);
		
		System.out.println();
		
		WebElement Tools = driver.findElement(By.xpath("//span[text()=\"Tools\"]"));
		act.moveToElement(Tools).build().perform();
		System.out.println(driver.findElement(By.xpath("(//ul[@class=\"sub-menu\"])[4]")).getText());
		System.out.println("Mouse moved over Tools");
		Thread.sleep(3000);

		System.out.println();
		
		WebElement InterviewsQA = driver.findElement(By.xpath("//span[text()=\"Interview Q & A\"]"));
		act.moveToElement(InterviewsQA).build().perform();
		System.out.println(driver.findElement(By.xpath("(//ul[@class=\"sub-menu\"])[9]")).getText());
		System.out.println("Mouse moved over InterviewsQA");
		Thread.sleep(3000);

		System.out.println();
		
		WebElement Quiz = driver.findElement(By.xpath("//span[text()=\"Quiz\"]"));
		act.moveToElement(Quiz).build().perform();
		System.out.println(driver.findElement(By.xpath("(//ul[@class=\"sub-menu\"])[12]")).getText());
		System.out.println("Mouse moved over Quiz");

		Thread.sleep(5000);
		driver.quit();
	}

}
