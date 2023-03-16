package WindowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();

		Thread.sleep(2000);

		Set<String> WindowID = driver.getWindowHandles();

		Iterator<String> it = WindowID.iterator();

		String ParentWindow = it.next();
		String ChildWindow = it.next();

		System.out.println("Parent Window :" + ParentWindow);
		System.out.println("Child Window :" + ChildWindow);

		Thread.sleep(3000);
		driver.switchTo().window(ParentWindow);

		Thread.sleep(3000);

		driver.switchTo().window(ChildWindow);
		Thread.sleep(3000);
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//input[@id=\"myText\"]")).sendKeys("Rkendre344@gmail.com");
		driver.findElement(By.id("linkadd")).click();

		driver.close();

		//

		for (String WinID : WindowID) {
			String Title = driver.switchTo().window(WinID).getTitle();

			if (Title.equals("OrangeHRM")
					|| Title.equals(" HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM\r\n" + ""))

				driver.close();
		}
	}

}