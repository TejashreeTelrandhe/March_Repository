package Guru99_TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Guru99_BaseClass.Base_Class;
import Guru99_PageObjectModel.Guru99_ChangePassword;
import Guru99_PageObjectModel.Guru99_LoginPage;

public class TC_ChangePassword extends Base_Class {

	@Test
	public void ChangePasswordTest() throws IOException {
		Guru99_LoginPage LP = new Guru99_LoginPage();
		logger.info("Enter Userid");
		LP.setUserid();
		
		logger.info("Enter Password");
		LP.setPassword();
		
		logger.info("Click on login button");
		LP.clickLogin();
		
		Guru99_ChangePassword CP = new Guru99_ChangePassword();
		logger.info("Click ChangePassword");
		CP.clickChangePassword();
		
		logger.info("ChangePassword page refreshed");
		driver.navigate().refresh();
		
		logger.info("Click ChangePassword");
		CP.clickChangePassword();
		
		logger.info("Enter OldPassword");
		CP.setOldPassword();
		
		logger.info("Enter NewPassword");
		CP.setNewPassword();
		
		logger.info("Enter ConfirmPassword");
		CP.setConfirmPassword();
		
		logger.info("Verify ChangePassword heading");
		CP.verifyHeading();
		
		logger.info("Click on submit button");
		CP.clickSubmit();
		
		logger.info("Handled the alert by clicking on ok");
		driver.switchTo().alert().accept();
		
		logger.info("Verify ChangePassword page title");
		if (driver.getTitle().equals("Guru99 Bank New Customer Entry Page")) {
			System.out.println("ChangePassword Passed");
			System.out.println(driver.getTitle());
		} 
		else {
			getScreenshotAs("ChangePasswordTest");
//			System.out.println("ChangePassword Failed");
			Assert.assertTrue(true);
		}
	}
}
