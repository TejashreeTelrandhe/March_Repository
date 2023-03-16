package POM_With_PageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99_TestClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/index.php");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		Guru99_LoginPage LP = new Guru99_LoginPage(driver);
		LP.setUserid();
		LP.setPassword();
		LP.clickLogin();
		
		Guru99_NewCustomer NC = new Guru99_NewCustomer(driver);
		NC.verifyHeading();
		NC.clickNewCustomer();
		driver.navigate().refresh();
		NC.clickNewCustomer();
		NC.setCustomername();
		NC.clickGender();
		NC.setDateofbirth();
		NC.setAddress();
		NC.setCity();
		NC.setState();
		NC.setPIN();
		NC.setMobilenumber();
		NC.setEmail();
		NC.setPassword();
		NC.clickSubmit();
		
		Guru99_EditCustomer EC = new Guru99_EditCustomer(driver);
		EC.clickEditCustomer();
		driver.navigate().refresh();
		EC.clickEditCustomer();
		EC.verifyHeading();
		EC.setCustomerId();
		EC.clickSubmit();
		
		Guru99_ChangePassword CP = new Guru99_ChangePassword(driver);
		CP.clickChangePassword();
		driver.navigate().refresh();
		CP.clickChangePassword();
		CP.verifyHeading();
		CP.setOldPassword();
		CP.setNewPassword();
		CP.setConfirmPassword();
		CP.clickSubmit();
		
		driver.quit();
	}

}
