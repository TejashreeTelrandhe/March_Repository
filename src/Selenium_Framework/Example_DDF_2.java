package Selenium_Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example_DDF_2 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(CO);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/index.php");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

//		Excel sheet for data fetch
		FileInputStream file = new FileInputStream("C:\\Users\\Tejashree\\Desktop\\ExcelFile\\March_1_DDF.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
//		String uid = sheet.getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.name("uid")).sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
		
//		String password = sheet.getRow(2).getCell(1).getStringCellValue();
		driver.findElement(By.name("password")).sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());
		
		driver.findElement(By.name("btnLogin")).click();
		
		System.out.println(driver.findElement(By.xpath("//marquee[@class=\"heading3\"]")).getText());
		
		driver.findElement(By.xpath("//a[text()=\"New Customer\"]")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[text()=\"New Customer\"]")).click();
		
//		String name1 = sheet.getRow(3).getCell(1).getStringCellValue();
		driver.findElement(By.name("name")).sendKeys(sheet.getRow(3).getCell(1).getStringCellValue());
		
		driver.findElement(By.xpath("(//input[@name=\"rad1\"])[1]")).click();
		
//		String dobd = sheet.getRow(4).getCell(1).getStringCellValue();	
		driver.findElement(By.name("dob")).sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
//		String dobm = sheet.getRow(5).getCell(1).getStringCellValue();	
		driver.findElement(By.name("dob")).sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());
//		String doby = sheet.getRow(6).getCell(1).getStringCellValue();	
		driver.findElement(By.name("dob")).sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());
		
//		String addr =sheet.getRow(7).getCell(1).getStringCellValue();
		driver.findElement(By.name("addr")).sendKeys(sheet.getRow(7).getCell(1).getStringCellValue());
		
//		String city =sheet.getRow(8).getCell(1).getStringCellValue();
		driver.findElement(By.name("city")).sendKeys(sheet.getRow(8).getCell(1).getStringCellValue());
		
//		String state =sheet.getRow(9).getCell(1).getStringCellValue();
		driver.findElement(By.name("state")).sendKeys(sheet.getRow(9).getCell(1).getStringCellValue());
		
//		String pin =sheet.getRow(10).getCell(1).getStringCellValue();
		driver.findElement(By.name("pinno")).sendKeys(sheet.getRow(10).getCell(1).getStringCellValue());
		
//		String mob =sheet.getRow(11).getCell(1).getStringCellValue();
		driver.findElement(By.name("telephoneno")).sendKeys(sheet.getRow(11).getCell(1).getStringCellValue());
		
//		String mailid =sheet.getRow(12).getCell(1).getStringCellValue();
		driver.findElement(By.name("emailid")).sendKeys(sheet.getRow(12).getCell(1).getStringCellValue());
		
//		String pass =sheet.getRow(13).getCell(1).getStringCellValue();
		driver.findElement(By.name("password")).sendKeys(sheet.getRow(13).getCell(1).getStringCellValue());
		
		driver.findElement(By.name("sub")).click();		

		Thread.sleep(10000);
		driver.quit();
	}

}
