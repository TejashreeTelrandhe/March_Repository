package WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(3000);
		
		List <WebElement> row = driver.findElements(By.xpath("//table[@id=\"customers\"]//tr"));
		System.out.println("Total number of rows = "+row.size());
		
		List<WebElement> column = driver.findElements(By.xpath("//table[@id=\"customers\"]//tr//th"));
		System.out.println("Total number of columns = "+column.size());
		
		for(int i=2;i<row.size();i++) {
			for(int j=1;j<column.size();j++) {
				String data = driver.findElement(By.xpath("//table[@id=\"customers\"]//tr["+i+"]//td["+j+"]")).getText();
//				System.out.print(data+" | ");
				if(data.equals("Helen Bennett")) {
					System.out.println(data);
					System.out.println("Row : "+i+", Column : "+j);
					continue;
				}
			}
		}
		Thread.sleep(7000);
		driver.quit();
	}

}
