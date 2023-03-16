package FindElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		WebElement Searchbox =driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		Searchbox.sendKeys("OnePlus");
//		
//		WebElement Link = driver.findElement(By.xpath("//a[@class=\"nav-a www  \"]"));
//		System.out.println(Link.getText());

//		WebElement Link1 = driver.findElement(By.xpath("//a[@class=\"nav-a www \"]"));
//		System.out.println(Link1);
	}

}