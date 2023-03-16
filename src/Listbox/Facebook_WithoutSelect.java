package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_WithoutSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();

		Thread.sleep(3000);
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select s1 = new Select(day);		
		List<WebElement> dayOB = s1.getOptions();
		for(int i=0;i<dayOB.size();i++) {
			System.out.println(dayOB.get(i).getText());
			if(dayOB.get(i).getText().equals("8")) {
				dayOB.get(i).click();
			}
		}
		System.out.println("8 selected");
		System.out.println();
		Select s2 = new Select(month);		
		List<WebElement> monthOB = s2.getOptions();
		for(int i=0;i<monthOB.size();i++) {
			System.out.println(monthOB.get(i).getText());
			if(monthOB.get(i).getText().equals("Feb")) {
				monthOB.get(i).click();
			}
		}
		System.out.println("Feb selected");
		System.out.println();
		Select s3 = new Select(year);		
		List<WebElement> yearOB = s3.getOptions();
		for(int i=0;i<yearOB.size();i++) {
			System.out.println(yearOB.get(i).getText());
			if(yearOB.get(i).getText().equals("1999")) {
				yearOB.get(i).click();
			}
		}
		System.out.println("1999 selected");
	}

}
