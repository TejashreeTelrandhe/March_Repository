package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		String ExpectedResult = "Facebook helps you cct and share with the people in your life.";
		String text = driver.findElement(By.xpath(
				"//h2[contains(text(),'Facebook helps you connect" + " and share with the people in your life.')]"))
				.getText();

		System.out.println(text.equals(ExpectedResult));

	}

}