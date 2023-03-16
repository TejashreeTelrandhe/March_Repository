package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus_WithoutSelectMethod {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);

		driver.findElement(By.id("src")).sendKeys("Bangalore");
		Thread.sleep(3000);
				
		String source ="//ul[@class=\"autoFill homeSearch\"]//li";
		String destination ="//ul[@class=\"autoFill homeSearch\"]//li";
		
		dropdown(source,"Bommasandra, Bangalore");
		Thread.sleep(3000);
		
		driver.findElement(By.id("dest")).sendKeys("Pune");
		Thread.sleep(3000);
		System.out.println();
		dropdown(destination,"Katraj, Pune");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//td[@class=\"next\"]")).click();
		driver.findElement(By.xpath("//td[text()=\"6\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("search_btn")).click();
	}
public static void dropdown(String xpathtext ,String select) {
	List<WebElement> option = driver.findElements(By.xpath(xpathtext));
	System.out.println("Number of options in listbox : "+option.size());
	
	for(int i=0;i<option.size();i++) {
		System.out.println(option.get(i).getText());
		if(option.get(i).getText().equals(select)) {
			option.get(i).click();
			break;
		}
	}
}
}
