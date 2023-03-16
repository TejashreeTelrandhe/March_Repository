package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbyattribute {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
			
		 WebDriver driver = new ChromeDriver(); 
			
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.facebook.com/");
		 
		 Thread.sleep(3000);
		 
		 //Xpath by attributes
		 
		 //Syntax - //tagname[@attributenam="attributevalues"]
		 
		 driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("kendreraneet222@gmail.com");
		 
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy _9npi\"]")).sendKeys("qwert");
	
	}

}