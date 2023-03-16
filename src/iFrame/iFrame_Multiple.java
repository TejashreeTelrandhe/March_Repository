package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame_Multiple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[text()=\"Iframe with in an Iframe\"]")).click();
		WebElement outer = driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[2]/div[2]/iframe"));

		driver.switchTo().frame(outer);
		System.out.println(driver.findElement(By.xpath("//h5[text()=\"Nested iFrames\"]")).getText());
		System.out.println();
		WebElement inner = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(inner);

		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Iframe with in an Iframe");

		System.out.println(driver.findElement(By.xpath("//h5[text()=\"iFrame Demo\"]")).getText());

	}

}
