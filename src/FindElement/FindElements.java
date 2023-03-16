package FindElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		List<WebElement> Link = driver.findElements(By.xpath("//a[@class=\"nav-a  \"]"));

		System.out.println("Number of elemets :" + Link.size());

		for (WebElement ele : Link) {
			System.out.println(ele.getText());
		}

		List<WebElement> Link1 = driver.findElements(By.xpath("//a[@class=\"nav-a WWW \"]"));
		System.out.println("Number of ele :" + Link1.size());
	}

}