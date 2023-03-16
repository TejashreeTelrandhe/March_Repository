package AdvancedXpath;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Thread.sleep(5000);
		// Descendant
		List<WebElement> List1 = driver
				.findElements(By.xpath("//a[contains(text(),'Hinduja Global Solut')]/ancestor::tr/descendant::td"));
		System.out.println("Number of descendant node :" + List1.size());

		// Following
		List<WebElement> List2 = driver
				.findElements(By.xpath("//a[contains(text(),'Hinduja Global Solut')]/following::tr"));
		System.out.println("Number of Follwoing nodes :" + List2.size());

		// Following -sibling
		List<WebElement> List3 = driver.findElements(
				By.xpath("//a[contains(text(),'Hinduja Global Solut')]/ancestor::tr/following-sibling::tr"));
		System.out.println("Number of following-sibling node :" + List3.size());

		// Preceding - Select all the element before the node/document
		List<WebElement> List4 = driver
				.findElements(By.xpath("//a[contains(text(),'Hinduja Global Solut')]/ancestor::tr/preceding::tr"));
		System.out.println("Number of preceding nodes :" + List4.size());

		// Preceding-sibling
		List<WebElement> List5 = driver.findElements(
				By.xpath("//a[contains(text(),'Hinduja Global Solut')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println("Number of preceding-sibling nodes :" + List5.size());

	}

}
