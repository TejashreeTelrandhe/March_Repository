package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_Auto_Skill1 {

	public static void main(String[] args) throws InterruptedException {
//		Automate the following scenarios:
//			Invoke Google Chrome Browser
//			Open URL: https://demo.automationtesting.in/Register.html
//			1. Print all the values form "Skills" drop-down and select APIs values from it
//			Close the browser.
//			2. Print all the values which are present in day, month and year drop down & Select Date Of Birth (8/06/1923)
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(6000);
		
		WebElement skill =driver.findElement(By.id("Skills"));
		
		Select skill1 = new Select (skill);
		List<WebElement> skill2 =skill1.getOptions();
		
		for(int b=0;b<=skill2.size()-1;b++) {
			String skill3=(skill2.get(b).getText());
			System.out.println(skill3);
		
			if(skill3.equals("APIs")) {
				skill2.get(b).click();
				Thread.sleep(3000);
				System.out.println(skill2.get(b).getText());
			}		
		}		
		driver.close();	
	}
}