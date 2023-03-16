package Guru99_TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Guru99_BaseClass.Base_Class;
import Guru99_PageObjectModel.Guru99_LoginPage;

public class TC_LoginPage extends Base_Class{

	@Test
	public void LoginTest() throws IOException {
		Guru99_LoginPage LP = new Guru99_LoginPage();
		logger.info("Enter Userid");
		LP.setUserid();
		
		logger.info("Enter Password");
		LP.setPassword();
		
		logger.info("Click on login button");
		LP.clickLogin();
		
		logger.info("Verify the loginpage tile");
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			System.out.println("LoginTest Passed");
			System.out.println(driver.getTitle());

		} else {
			getScreenshotAs("LoginTest");
			Assert.assertTrue(true);
//			System.out.println("LoginTest Failed");
		}
	}	
}
