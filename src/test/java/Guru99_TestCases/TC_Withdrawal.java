package Guru99_TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Guru99_BaseClass.Base_Class;
import Guru99_PageObjectModel.Guru99_LoginPage;
import Guru99_PageObjectModel.Guru99_Withdrawal;

public class TC_Withdrawal extends Base_Class {

	@Test
	public void WithdrawalTest() throws IOException {
		Guru99_LoginPage LP = new Guru99_LoginPage();
		logger.info("Enter Userid");
		LP.setUserid();
		
		logger.info("Enter Password");
		LP.setPassword();
		
		logger.info("Click on login button");
		LP.clickLogin();
		
		Guru99_Withdrawal W = new Guru99_Withdrawal();
		logger.info("Click on Withdrawal");
		W.clickWithdrawal();
		
		logger.info("Withdrawal page refreshed");
		driver.navigate().refresh();
		
		logger.info("Click on Withdrawal");
		W.clickWithdrawal();
		
		logger.info("Verify Withdrawal heaading");
		W.verifyHeading();
		
		logger.info("Enter account no");
		W.setAccountNo();
		
		logger.info("Enter ammount");
		W.setAmount();
		
		logger.info("Enter description");
		W.setDescription();
		
		logger.info("Click on submit button");
		W.clickSubmit();
		
//		driver.switchTo().alert().accept();
		logger.info("Verify withdrawal page title");
		if (driver.getTitle().equals("Guru99 Bank Amount Withdrawal Page")) {
			System.out.println("WithdrawalTest Passed");
			System.out.println(driver.getTitle());

		} else {
			getScreenshotAs("WithdrawalTest");
			Assert.assertTrue(true);
//			System.out.println("WithdrawalTest Failed");

		}
	}
}
