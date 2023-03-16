package MultipleLinks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleLinks1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/");

		// How many links are present on the webpage

		List<WebElement> Links = driver.findElements(By.tagName("a"));

		Thread.sleep(3000);

		System.out.println("Numbe of links present on Webpage :" + Links.size());

		// Print all the links

		for (WebElement link : Links) {

			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
		}

	}

}