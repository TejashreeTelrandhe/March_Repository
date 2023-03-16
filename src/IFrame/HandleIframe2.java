package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIframe2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		   WebDriver driver = new ChromeDriver();
						
		   driver.manage().window().maximize();
				
		   Thread.sleep(3000);
		   
		   driver.get("https://demo.automationtesting.in/Frames.html");
		   
		   Thread.sleep(3000);
		   
		   driver.switchTo().frame("singleframe");
		   
		   driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Welcome");		   
	}

}