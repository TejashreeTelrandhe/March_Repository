package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame_ID {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		Thread.sleep(3000);

		System.out.println("Frame 1");

		driver.switchTo().frame("frame1");// ID

		System.out.println(driver.findElement(By.id("sampleHeading")).getText());

		driver.switchTo().parentFrame();

		System.out.println();

		System.out.println("Frame 2");

		driver.switchTo().frame("frame2");// ID

		System.out.println(driver.findElement(By.id("sampleHeading")).getText());

	}

}
