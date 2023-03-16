package WindowHandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle1 {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
			
		 WebDriver driver = new ChromeDriver();  	
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 String WindowID=driver.getWindowHandle();
		 
		 System.out.println(WindowID);
		// CDwindow-E7B01060E2EC0022C1C2D1369ECCA68C
        
		 driver.quit();
		// Getwindowhandle method is used to store the single window browser ID
	}

}