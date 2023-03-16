package POM_With_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Guru99_TestClass_DDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(CO);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/index.php");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		String path ="C:\\Users\\Tejashree\\Desktop\\ExcelFile\\POM_With_DDF.xlsx";
		FileInputStream file = new FileInputStream(path);
		Sheet sh = WorkbookFactory.create(file).getSheetAt(0);	
		
		Guru99_LoginPage_DDF LPD = new Guru99_LoginPage_DDF(driver);
		String UN = sh.getRow(1).getCell(1).getStringCellValue();
		LPD.setUserid(UN);
		String PWD = sh.getRow(2).getCell(1).getStringCellValue();
		LPD.setPassword(PWD);
		LPD.clickLogin();
		
		Guru99_NewCustomer_DDF NCD = new Guru99_NewCustomer_DDF(driver);
		NCD.verifyHeading();
		NCD.clickNewCustomer();
		driver.navigate().refresh();
		NCD.clickNewCustomer();
		String CUSTNAME = sh.getRow(3).getCell(1).getStringCellValue();
		NCD.setCustomername(CUSTNAME);
		NCD.clickGender();
		String DOBDD = sh.getRow(4).getCell(1).getStringCellValue();
		String DOBMM = sh.getRow(5).getCell(1).getStringCellValue();
		String DOBYYYY = sh.getRow(6).getCell(1).getStringCellValue();
		NCD.setDateofbirth(DOBDD,DOBMM,DOBYYYY);
		String ADD = sh.getRow(7).getCell(1).getStringCellValue();
		NCD.setAddress(ADD);
		String CITY = sh.getRow(8).getCell(1).getStringCellValue();
		NCD.setCity(CITY);
		String STATE = sh.getRow(9).getCell(1).getStringCellValue();
		NCD.setState(STATE);
		String PIN = sh.getRow(10).getCell(1).getStringCellValue();
		NCD.setPIN(PIN);
		String MOBILE = sh.getRow(11).getCell(1).getStringCellValue();
		NCD.setMobilenumber(MOBILE);
		String CUSTEMAIL = sh.getRow(12).getCell(1).getStringCellValue();
		NCD.setEmail(CUSTEMAIL);
		String CUSTPWD = sh.getRow(13).getCell(1).getStringCellValue();
		NCD.setPassword(CUSTPWD);
		NCD.clickSubmit();
		
		Guru99_EditCustomer_DDF ECD = new Guru99_EditCustomer_DDF(driver);
		ECD.clickEditCustomer();
		driver.navigate().refresh();
		ECD.clickEditCustomer();
		ECD.verifyHeading();
		String CUSTID = sh.getRow(14).getCell(1).getStringCellValue();
		ECD.setCustomerId(CUSTID);
		ECD.clickSubmit();
		
		Guru99_ChangePassword_DDF CPD = new Guru99_ChangePassword_DDF(driver);
		CPD.clickChangePassword();
		driver.navigate().refresh();
		CPD.clickChangePassword();
		CPD.verifyHeading(); 
		String OLDPWD = sh.getRow(15).getCell(1).getStringCellValue();
		CPD.setOldPassword(OLDPWD);
		String NEWPWD = sh.getRow(16).getCell(1).getStringCellValue();
		CPD.setNewPassword(NEWPWD);
		String CONPWD = sh.getRow(17).getCell(1).getStringCellValue();
		CPD.setConfirmPassword(CONPWD);
		CPD.clickSubmit();
		driver.quit();
	}

}
