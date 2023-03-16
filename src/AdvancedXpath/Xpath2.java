package AdvancedXpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {

	public static void main(String[] args) {

		/*
		 * Xpath axces - Xpath axces are used to identify element by their relationship
		 * like parent,child,sibling
		 */

		/*
		 * These method are mainly used when the web element not identified with the
		 * help ID,name,Classname, link,link,text,css selctor
		 */

		/*
		 * Xpath Axces 1. Self 2. Parent 3. Child 4.Ancestor 5.Descendent 6.Following
		 * 7.following-sibling 8.Preceding 9.Preceding-sibling
		 */

		System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// self
		String Text = driver.findElement(By.xpath("//a[contains(text(),'Indian Bank')]/self::a")).getText();
		System.out.println(Text);

		// Parent
		String Text1 = driver.findElement(By.xpath("//a[contains(text(),'Indian Bank')]/parent::td")).getText();
		System.out.println(Text1);

		// Child

		/// i want to find out all child element
		List<WebElement> Child = driver
				.findElements(By.xpath("//a[contains(text(),'Indian Bank')]/ancestor::tr/child::td"));

		System.out.println("Number of child element :" + Child.size());

		// Ancestor //Print all the row data

		String Text2 = driver.findElement(By.xpath("//a[contains(text(),'Indian Bank')]/ancestor::tr")).getText();
		System.out.println(Text2);
		driver.quit();

	}

}
