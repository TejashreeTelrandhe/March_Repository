package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_Auto_Skill2 {

	public static void main(String[] args) throws InterruptedException {
		//		Automate the following scenarios:
		//		Invoke Google Chrome Browser
		//		Open URL: https://demo.automationtesting.in/Register.html
		//      2. Print all the values which are present in day, month and year drop down & Select Date Of Birth (8/06/1923)
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(4000);
		
		System.out.println();
		WebElement day = driver.findElement(By.id("daybox"));	
		Select day1 = new Select(day);
		List<WebElement> day2 =day1.getOptions();
		
		for(int c=0;c<=day2.size()-1;c++) {
			String day3= day2.get(c).getText();
			System.out.println(day3);
		}
		
		System.out.println();
		WebElement month = driver.findElement(By.xpath("(//select[@class=\"form-control ng-pristine ng-untouched ng-invalid ng-invalid-required\"])[3]"));
		Select month1 = new Select(month);
		List<WebElement> month2 =month1.getOptions();
		
		for(int b=0;b<=month2.size()-1;b++) {
			String month3= month2.get(b).getText();
			System.out.println(month3);
		}
		
		WebElement year = driver.findElement(By.id("yearbox"));
		Select year1 = new Select(year);
		List<WebElement> year2 =year1.getOptions();
		
		for(int a=0;a<=year2.size()-1;a++) {
			String year3= year2.get(a).getText();
			System.out.println(year3);		
		}
		
		System.out.println();
		String date = "8/June/1923";
		String [] ar = date.split("/");
		
		date(day,ar[0]);
		date(month,ar[1]);
		date(year,ar[2]);
		Thread.sleep(4000);
	
		driver.close();
	}
	public static void date(WebElement Text,String Value){
		Select s1 = new Select (Text);
		s1.selectByValue(Value);
	}
	}