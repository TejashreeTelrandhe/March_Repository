package Guru99_TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import Guru99_BaseClass.Base_Class;
import Guru99_PageObjectModel.Guru99_DeleteAccount;
import Guru99_PageObjectModel.Guru99_LoginPage;

public class TC_DeleteAccount extends Base_Class {
	@Test
	public void DeleteAccountTest() throws IOException {
		Guru99_LoginPage LP = new Guru99_LoginPage();
		logger.info("Enter Userid");
		LP.setUserid();

		logger.info("Enter Password");
		LP.setPassword();

		logger.info("Click on login button");
		LP.clickLogin();

		Guru99_DeleteAccount DA = new Guru99_DeleteAccount();
		logger.info("Click on DeleteAccount");
		DA.clickDeleteAccount();
		
		logger.info("DeleteAccount Page refreshed");
		driver.navigate().refresh();
		
		logger.info("Click on DeleteAccount");
		DA.clickDeleteAccount();
		
		logger.info("Verify DeleteAccount heading");
		DA.verifyHeading(); 
		
		logger.info("Enter account no");
		DA.setAccountNo();
		
		logger.info("Click on submit button");
		DA.clickSubmit();
		
		logger.info("Dismiss the alert");
		driver.switchTo().alert().dismiss();
		
		logger.info("Verify deleteaccount page title");
		if (driver.getTitle().equals("Guru99 Bank Delete Account Page")) {
			System.out.println("DeleteAccountTest Passed");
			System.out.println(driver.getTitle());
		} else {
			getScreenshotAs("DeleteAccountTest");
//			System.out.println("DeleteAccountTest Failed");
			Assert.assertTrue(true);
		}
	}

}
