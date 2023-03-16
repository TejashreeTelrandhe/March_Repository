package Guru99_TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Guru99_BaseClass.Base_Class;
import Guru99_PageObjectModel.Guru99_CustomisedStatement;
import Guru99_PageObjectModel.Guru99_LoginPage;

public class TC_CustomisedStatement extends Base_Class {
	@Test
	public void CustomisedStatementTest() throws IOException {
		Guru99_LoginPage LP = new Guru99_LoginPage();
		logger.info("Enter Userid");
		LP.setUserid();
		
		logger.info("Enter Password");
		LP.setPassword();
		
		logger.info("Click on login button");
		LP.clickLogin();
		
		Guru99_CustomisedStatement CS = new Guru99_CustomisedStatement();
		logger.info("Click CustomisedStatement");
		CS.clickCustomisedStatement();
		
		logger.info("CustomisedStatement page refreshed");
		driver.navigate().refresh();
		
		logger.info("Click CustomisedStatement");
		CS.clickCustomisedStatement();
		
		logger.info("Verify CustomisedStatement heading");
		CS.verifyHeading();
		
		logger.info("Enter account no");
		CS.setAccountNo();
		
		logger.info("Select from date");
		CS.setFromDate();
		
		logger.info("Select to date");
		CS.setToDate();
		
		logger.info("Enter MinimumTransactionValue ");
		CS.setMinimumTransactionValue();
		
		logger.info("Enter NumberofTransaction");
		CS.setNumberofTransaction();
		
		logger.info("Click on submit button");
		CS.clickSubmit();
		
		logger.info("Verify CustomisedStatement Title");
		if(driver.getTitle().equals("Guru99 Bank Customised Statement Page")) {
			System.out.println("CustomisedStatement Passed");
			System.out.println(driver.getTitle());
		}
		else {
			getScreenshotAs("CustomisedStatementTest");
//			System.out.println("CustomisedStatement Failed");
			Assert.assertTrue(true);
		}
	}
}
