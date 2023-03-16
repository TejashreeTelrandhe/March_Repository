package ListBox;
import java.util.List;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox7{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(4000);
		
		System.out.println();
		WebElement day = driver.findElement(By.id("daybox"));	
		Select s1 = new Select(day);
		List<WebElement> s2 =s1.getOptions();
		
		for(int c=0;c<=s2.size()-1;c++) {
			String day3= s2.get(c).getText();
			System.out.println(day3);
		}
		
		System.out.println();
		WebElement month = driver.findElement(By.xpath("(//select[@class=\"form-control ng-pristine ng-untouched ng-invalid ng-invalid-required\"])[3]"));
		Select m1 = new Select(month);
		List<WebElement> month2 =m1.getOptions();
		
		for(int b=0;b<=month2.size()-1;b++) {
			String m3= month2.get(b).getText();
			System.out.println(m3);
		}
		
		WebElement year = driver.findElement(By.id("yearbox"));
		Select y1 = new Select(year);
		List<WebElement> year2 =y1.getOptions();
		
		for(int a=0;a<=year2.size()-1;a++) {
			String y3= year2.get(a).getText();
			System.out.println(y3);		
		}
		
		System.out.println();
		String DOB = "8/June/1923";
		String S[] = DOB.split("/");
		
		date(day,S[0]);
		date(month,S[1]);
		date(year,S[2]);
		Thread.sleep(4000);
	
		driver.close();
	}
	public static void date(WebElement Text,String Value){
		Select s1 = new Select (Text);
		s1.selectByValue(Value);
	}

			
	}