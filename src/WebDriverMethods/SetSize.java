package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		Dimension Size = new Dimension(800, 200);
		
		driver.manage().window().setSize(Size);
		
		Thread.sleep(5000);
		
	//	driver.quit();
		
		
	}

}