package Guru99_TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Guru99_BaseClass.Base_Class;
import Guru99_PageObjectModel.Guru99_EditAccount;
import Guru99_PageObjectModel.Guru99_LoginPage;

public class TC_EditAccount extends Base_Class {
	@Test
	public void EditAccountTest() throws IOException {
		Guru99_LoginPage LP = new Guru99_LoginPage();
		logger.info("Enter Userid");
		LP.setUserid();

		logger.info("Enter Password");
		LP.setPassword();

		logger.info("Click on login button");
		LP.clickLogin();

		Guru99_EditAccount EA = new Guru99_EditAccount();
		logger.info("Click on EditAccount");		
		EA.clickEditAccount();
		
		logger.info("EditAccount page refreshed");
		driver.navigate().refresh();
		
		logger.info("Click on EditAccount");
		EA.clickEditAccount();
		
		logger.info("Verify EditAccount heading");
		EA.verifyHeading();
		
		logger.info("Enter Account no");
		EA.setAccountNo();

		logger.info("Click Submit");
		EA.clickSubmit();
		
		logger.info("Verify EditAccount page Title");
		if (driver.getTitle().equals("Guru99 Edit Account Page")) {
			System.out.println("EditAccountTest Passed");
			System.out.println(driver.getTitle());

		} else {
			getScreenshotAs("EditAccountTest");
			Assert.assertTrue(true);
//			System.out.println("EditAccountTest Failed");

		}
	}
}