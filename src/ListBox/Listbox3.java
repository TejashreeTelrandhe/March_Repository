package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();

		Thread.sleep(3000);

		WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));

		Thread.sleep(3000);
//		    Listbox(day, "13");
//		    Listbox(month, "5");
//		    Listbox(year, "2010");

		String DOB = "13/5/2010";

		String date[] = DOB.split("/");
		// 0- 13
		// 1 -05
		// 2 - 2010

		dropdown(day, date[0]);
		dropdown(month, date[1]);
		dropdown(year, date[2]);
	}

	public static void dropdown(WebElement text, String value) {

		Select select1 = new Select(text);
		select1.selectByValue(value);

	}
}