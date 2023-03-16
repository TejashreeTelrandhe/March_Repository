package POM_With_DDF_Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Guru99_TestClass_DDF_Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(CO);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/index.php");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		Guru99_LoginPage_DDF LPD = new Guru99_LoginPage_DDF(driver);
		LPD.setUserid("mngr472933");
		LPD.setPassword("UqEryra");
		LPD.clickLogin();
		
		Guru99_NewCustomer_DDF NCD = new Guru99_NewCustomer_DDF(driver);
		NCD.verifyHeading();
		NCD.clickNewCustomer();
		driver.navigate().refresh();
		NCD.clickNewCustomer();
		NCD.setCustomername("Tripti Talekar");
		NCD.clickGender();
		NCD.setDateofbirth("14","05","1993");
		NCD.setAddress("Shivaji Ward");
		NCD.setCity("Pandhurna");
		NCD.setState("Madhya Pradesh");
		NCD.setPIN("400321");
		NCD.setMobilenumber("8805691000");
		NCD.setEmail("tripti@gmail.com");
		NCD.setPassword("tripti92");
		NCD.clickSubmit();
		
		Guru99_EditCustomer_DDF ECD = new Guru99_EditCustomer_DDF(driver);
		ECD.clickEditCustomer();
		driver.navigate().refresh();
		ECD.clickEditCustomer();
		ECD.verifyHeading();
		ECD.setCustomerId("42233");
		ECD.clickSubmit();
		
		Guru99_ChangePassword_DDF CPD = new Guru99_ChangePassword_DDF(driver);
		CPD.clickChangePassword();
		driver.navigate().refresh();
		CPD.clickChangePassword();
		CPD.verifyHeading();
		CPD.setOldPassword("UqEryra");
		CPD.setNewPassword("AbCdefg");
		CPD.setConfirmPassword("AbCdefg");
		CPD.clickSubmit();
		driver.quit();
	}

}
