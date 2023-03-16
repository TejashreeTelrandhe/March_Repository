package AdvancedXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Absolute Xpath

		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div/div/input")).sendKeys("Rohit");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div/div[2]/input")).sendKeys("Patil");

		// Relative Xpath
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Patil");

		// Xpath with or

//         A      B      Result 
//        False  False   No Element
//        True   False   Return True
//        False  True    Return True
//        True   True    Both True

		driver.findElement(By.xpath("//input[@type=\"text\" or ng-model=\"FirstName\"]")).sendKeys("WWW");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\" or @ng-model=\"LastName\"]")).sendKeys("RRR");

		// Xpath with and

//      A      B      Result 
//     False  False   No Element
//     True   False   No Element 
//     False  True    No Element 
//     True   True    Return True

		driver.findElement(By.xpath("//input[@type=\"text\" and @ng-model=\"FirstName\"]")).sendKeys("FFF");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\" and @ng-model=\"LastName\"]")).sendKeys("SSS");

		// Chained Xpath

		driver.findElement(By.xpath("//div[@class=\"col-md-4 col-xs-4 col-sm-4\"]//input[@placeholder=\"First Name\"]"))
				.sendKeys("DFGH");
		driver.findElement(By.xpath("//div[@class=\"col-md-4 col-xs-4 col-sm-4\"]//input[@placeholder=\"Last Name\"]"))
				.sendKeys("ASDFG");
	}

}