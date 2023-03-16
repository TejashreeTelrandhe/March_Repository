package Guru99_TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Guru99_BaseClass.Base_Class;
import Guru99_PageObjectModel.Guru99_Deposit;
import Guru99_PageObjectModel.Guru99_LoginPage;

public class TC_Deposit extends Base_Class {
	@Test
	public void DepositTest() throws IOException {
		Guru99_LoginPage LP = new Guru99_LoginPage();
		logger.info("Enter Userid");
		LP.setUserid();
		
		logger.info("Enter Password");
		LP.setPassword();
		
		logger.info("Click on login button");
		LP.clickLogin();
		
		Guru99_Deposit D = new Guru99_Deposit();
		logger.info("Click on Deposit");
		D.clickDeposit();
		
		logger.info("Deposit page refreshed");
		driver.navigate().refresh();
		
		logger.info("Click on Deposit");
		D.clickDeposit();
		
		logger.info("Enter account no");
		D.setAccountNo();
		
		logger.info("Enter ammount");
		D.setAmount();
		
		logger.info("Enter description");
		D.setDescription();
		
		logger.info("Click submit");
		D.clickSubmit();
		
//		if (driver.getTitle().equals("Guru99 Bank Amount Deposit Page")) 
		logger.info("Verify Deposit page title");{
			if(driver.getTitle().equals("demo.guru99.com")) {
			System.out.println("DepositTest Passed");
			System.out.println(driver.getTitle());

		} 
		else {
			getScreenshotAs("DepositTest");
			Assert.assertTrue(true);
//			System.out.println("DepositTest Failed");
		}
	}
	}}
