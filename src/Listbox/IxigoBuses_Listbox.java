package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IxigoBuses_Listbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ixigo.com/buses");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@placeholder=\"Leaving from\"]")).click();
		Thread.sleep(3000);
		
		List<WebElement> leaving = driver.findElements(By.xpath("//div[@class=\"autocompleter-scroll-cntr\"]//div"));
		System.out.println("Total number of places to leave from : " + leaving.size());
		for(int i=0;i<leaving.size();i++) {
			System.out.println(leaving.get(i).getText());
			if(leaving.get(i).getText().equals("Mangalore")) {
				leaving.get(i).click();
				break;
			}
		}
		System.out.println("====================================");
		driver.findElement(By.xpath("//input[@placeholder=\"Going to\"]")).click();
		Thread.sleep(3000);
		List <WebElement> going = driver.findElements(By.xpath("//div[@class=\"autocompleter-scroll-cntr\"]//div"));
		System.out.println("Total number of places to go : " + going.size());
		for(int i=0;i<going.size();i++) {
			System.out.println(going.get(i).getText());
			if(going.get(i).getText().equals("Vijayawada")) {
				going.get(i).click();
				break;
			}
		}
		
		System.out.println("====================================");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class=\"c-input u-v-align-middle\"])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"rd-container bus-cal rd-container-attachment\"]//div[2]//div[2]//tr[3]//td[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=\"Search\"]")).click();
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}

}
