package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame_Index {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(3000);

		driver.switchTo().frame(0);
		
		System.out.println(driver.findElement(By.xpath("//h5[text()=\"iFrame Demo\"]")).getText());
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Frames");
		
		System.out.println("Switch to iframe with index");
		Thread.sleep(5000);
		driver.quit();
	}

}
