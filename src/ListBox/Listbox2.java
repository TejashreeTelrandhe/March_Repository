package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();

		Thread.sleep(3000);

		WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));

		// Select by visibleText();
//		    Select select1 = new Select(day);
//		    select1.selectByVisibleText("20");
//		    
//		    Select select2 = new Select(month);
//		    select2.selectByVisibleText("Feb");
//		    
//		    Select select3 = new Select(year);
//		    select3.selectByVisibleText("2015");
//		    
		// Select by index

//		    Select select4 = new Select(day);
//		    select4.selectByIndex(6);
//		    
//		    Select select5 = new Select(month);
//		    select5.selectByIndex(2);
//		    
//		    Select select6 = new Select(year);
//		    select6.selectByIndex(30);

		// Selectbyvalue

		Select s7 = new Select(day);
		s7.selectByValue("14");

		Select s8 = new Select(month);
		s8.selectByValue("8");

		Select s9 = new Select(year);
		s9.selectByValue("2212");

	}

}