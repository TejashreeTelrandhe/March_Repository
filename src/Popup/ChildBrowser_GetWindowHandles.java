package Popup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser_GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		String id = driver.getWindowHandle();
		System.out.println("Id of parent window is : " + id);

		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
//      1st method
		Set<String> winids = driver.getWindowHandles();
		System.out.println("Window id of child and parent frame : "+winids);
		System.out.println();

		
//		2nd method
		Iterator<String> List = winids.iterator();
		String parentwindow =List.next();
		String childwindow =List.next();
		System.out.println("parentwindow = "+parentwindow);
		System.out.println("childwindow = "+childwindow);
		System.out.println();
		
//      3rd method
		
		ArrayList<String> WindowList = new ArrayList(winids);
		String parent = WindowList.get(0);
		String child = WindowList.get(1);
		System.out.println("parent = "+parent);
		System.out.println("child = "+child);
		System.out.println();

		driver.switchTo().window(parentwindow);
		System.out.println(driver.findElement(By.xpath("//div[@class=\"orangehrm-login-slot-wrapper\"]")).getText());
		Thread.sleep(3000);
		System.out.println();

		driver.switchTo().window(childwindow);
		System.out.println(driver.findElement(By.xpath("//div[@class=\"homepage-slider-bottom\"]")).getText());
		Thread.sleep(3000);
		
		for(String WINDOW :winids) {
			String title = driver.switchTo().window(WINDOW).getTitle();
			if(title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM")) {
				System.out.println("Title matches");
				driver.close();
			}
		}
		driver.quit();
	}

}
