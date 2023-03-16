package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame_parentFrame_defaultContent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		Thread.sleep(3000);

		driver.switchTo().frame("iframeResult");
		driver.switchTo().frame(0);
		System.out.println(
				driver.findElement(By.xpath("//h1[text()=\"This page is displayed in an iframe\"]")).getText());

		driver.switchTo().parentFrame();

//      driver.switchTo().parentFrame() navigate from main child frame to parent frame

		System.out.println(driver.findElement(By.xpath(
				"//p[text()=\"You can use the height and width attributes to specify the size of the iframe:\"]"))
				.getText());

		System.out.println();

		driver.switchTo().frame(0);
		System.out.println(
				driver.findElement(By.xpath("//h1[text()=\"This page is displayed in an iframe\"]")).getText());

		driver.switchTo().defaultContent();

//      driver.switchTo().defaultContent() navigate from any child frame to parent frame
}

}
