package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIframe4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		   WebDriver driver = new ChromeDriver();
						
		   driver.manage().window().maximize();
				
		   Thread.sleep(3000);
		   
		   driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		   
		   driver.switchTo().frame("iframeResult");
		   
		   driver.switchTo().frame(0);
		   
		   Thread.sleep(3000);
		   
		   System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'This page is displayed in an iframe')]")).getText());
		   
		   
		   driver.switchTo().parentFrame();
		   
		   String Text=driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to specify the size of the iframe:')]")).getText();
		   
	   
		   System.out.println("Text Present in outer frame :"+Text);
		   
		   driver.switchTo().defaultContent();
		  
		   Thread.sleep(3000);
		   
           driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
	}

}