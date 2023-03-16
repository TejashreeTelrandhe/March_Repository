package Guru99_TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Guru99_BaseClass.Base_Class;
import Guru99_PageObjectModel.Guru99_LoginPage;
import Guru99_PageObjectModel.Guru99_MiniStatement;

public class TC_MiniStatement extends Base_Class{

	@Test
	public void MiniStatementTest() throws IOException {
		Guru99_LoginPage LP = new Guru99_LoginPage();
		logger.info("Enter Userid");
		LP.setUserid();
		
		logger.info("Enter Password");
		LP.setPassword();
		
		logger.info("Click on login button");
		LP.clickLogin();
		
		Guru99_MiniStatement MS = new Guru99_MiniStatement();
		logger.info("Click on MiniStatement");
		MS.clickMiniStatement();
		
		logger.info("MiniStatement page refreshed");
		driver.navigate().refresh();
		
		logger.info("Click on MiniStatement");
		MS.clickMiniStatement();
		
		logger.info("Verify MiniStatement heading");
		MS.verifyHeading();
		
		logger.info("Enter account no");
		MS.setAccountNo();
		
		logger.info("Click submit");
		MS.clickSubmit();
		
		logger.info("Verify MiniStatement page title");
		if (driver.getTitle().equals("Guru99 Bank Mini Statement Page")) {
			System.out.println("MiniStatementTest Passed");
			System.out.println(driver.getTitle());

		} else {
			getScreenshotAs("MiniStatementTest");
			Assert.assertTrue(true);
//			System.out.println("MiniStatementTest Failed");

		}
	}
}
