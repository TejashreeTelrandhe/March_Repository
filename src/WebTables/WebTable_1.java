package WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(3000);

		System.out.println(driver.findElement(By.xpath("//table[@class=\"ws-table-all\"]//tr[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//table[@class=\"ws-table-all\"]//tr[4]//td[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//table[@class=\"ws-table-all\"]//tr[6]//td[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//table[@class=\"ws-table-all\"]//tr[3]//td[3]")).getText());
		System.out.println(driver.findElement(By.xpath("//table[@class=\"ws-table-all\"]//tr[7]//td[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//table[@class=\"ws-table-all\"]//tr[4]//td[2]")).getText());
		
		System.out.println();
				
		List <WebElement> Row = driver.findElements(By.xpath("//table[@class=\"ws-table-all\"]//tr"));
		System.out.println("Total number of rows = "+Row.size());

		List <WebElement> Column = driver.findElements(By.xpath("//table[@class=\"ws-table-all\"]//tr//th"));
		System.out.println("Total number of columns = "+Column.size());
		
		System.out.println();
		
		for (int i=2;i<=Row.size();i++) {
			for(int j=1;j<=Column.size();j++) {
//				System.out.println(driver.findElement(By.xpath("//table[@class=\"ws-table-all\"]//tr["+i+"]//td["+j+"]")).getText());
				String data = driver.findElement(By.xpath("//table[@class=\"ws-table-all\"]//tr["+i+"]//td["+j+"]")).getText();
					System.out.print(data+" | ");	

			}
			System.out.println();
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
