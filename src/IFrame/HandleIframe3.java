package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIframe3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		   WebDriver driver = new ChromeDriver();
						
		   driver.manage().window().maximize();
				
		   Thread.sleep(3000);
		   
		   driver.get("https://demo.automationtesting.in/Frames.html");
		   
		   Thread.sleep(3000);
		   
		   driver.findElement(By.xpath("//a[@data-toggle=\"tab\" and contains(text(),'Iframe with in an Iframe')]")).click();
		   
		   
		  WebElement OuterFrame= driver.findElement(By.xpath("//div[@id=\"Multiple\"]//iframe"));
		  
		  driver.switchTo().frame(OuterFrame);
		  
		  WebElement InnerFrame =driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		  
		  driver.switchTo().frame(InnerFrame);

		  driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Welcome");

	}

}