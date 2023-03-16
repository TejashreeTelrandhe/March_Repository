package ExceptionHandling;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementException {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
		    driver.get("https://www.amazon.in/");
		    
		   WebElement Link = driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));
		   
		   Link.click();
		   
		   driver.navigate().back();
		   
		   try {
		   Link.click();
		   }
		   catch(StaleElementReferenceException e) {
			   Link=driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));
		       Link.click();
		   }	   
		   driver.quit();
		    
	}

}
