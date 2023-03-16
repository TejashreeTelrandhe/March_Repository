package WindowHandle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle2 {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
			
		 WebDriver driver = new ChromeDriver();  	
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		 
//		 String WinID=driver.getWindowHandle();
//		 System.out.println(WinID);
		 
		Set<String> WindowID = driver.getWindowHandles();
		
		System.out.println(WindowID);
		//First method
		Iterator<String> it  =WindowID.iterator();
		String ParentWindow =it.next();  //it gives first window
		String Childwindow =it.next();
		
		System.out.println("Parent Window :"+ParentWindow);
		System.out.println("Child window :"+Childwindow);
		
		//Second method  list /arraylist
		
		ArrayList<String> WindowList =new ArrayList(WindowID);
		String parent = WindowList.get(0);
		String child = WindowList.get(1);
		
		System.out.println("Parentwindow :"+parent);
		System.out.println("ChildWndow :"+child);
	}
	

}