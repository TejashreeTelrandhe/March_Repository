package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_With_DDF {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Enter Username
		String Path = "C:\\Users\\Tejashree\\Desktop\\ExcelFile\\DDFdata.xlsx";
		FileInputStream file = new FileInputStream(Path);

		Sheet Sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String Username = Sh.getRow(1).getCell(0).getStringCellValue();

		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(Username);
		Thread.sleep(2000);
		// Enter password
		String Password = Sh.getRow(1).getCell(1).getStringCellValue();

		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(Password);
		Thread.sleep(2000);
		// Click on login button
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		String ExpectedUsername = Sh.getRow(1).getCell(2).getStringCellValue();

		String ActualUsername = driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
		Thread.sleep(2000);
		if (ExpectedUsername.equals(ActualUsername)) {
			System.out.println("Correct username");
		} else {
			System.out.println("Incorrect username");
		}

		driver.quit();
	}

}