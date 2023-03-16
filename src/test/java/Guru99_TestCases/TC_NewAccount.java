package Guru99_TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Guru99_BaseClass.Base_Class;
import Guru99_PageObjectModel.Guru99_LoginPage;
import Guru99_PageObjectModel.Guru99_NewAccount;

public class TC_NewAccount extends Base_Class {

	@Test
	public void NewAccountTest() throws IOException {
		Guru99_LoginPage LP = new Guru99_LoginPage();
		logger.info("Enter Userid");
		LP.setUserid();

		logger.info("Enter Password");
		LP.setPassword();

		logger.info("Click on login button");
		LP.clickLogin();

		Guru99_NewAccount NA = new Guru99_NewAccount();
		logger.info("Click on NewAccount");
		NA.clickNewAccount();
		
		logger.info("NewAccount page refreshed");
		driver.navigate().refresh();
		
		logger.info("Click on NewAccount");
		NA.clickNewAccount();
		
		logger.info("Verify NewAccount heading");
		NA.verifyHeading();
		
		logger.info("Enter customer id");
		NA.setCustomerId();
		
		logger.info("ENter initial deposit");
		NA.setInitialDeposit();
		
		logger.info("Click Submit");
		NA.clickSubmit();
		
//		driver.switchTo().alert().accept();
		logger.info("Verify NewAccount Page title");
		if (driver.getTitle().equals("Gtpl Bank Customer Registration Page")) {
			System.out.println("NewAccountTest Passed");
			System.out.println(driver.getTitle());

		} else {
			getScreenshotAs("NewAccountTest");
			Assert.assertTrue(true);
//			System.out.println("NewAccountTest Failed");

		}
	}
}
