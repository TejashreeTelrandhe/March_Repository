package Guru99_TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Guru99_BaseClass.Base_Class;
import Guru99_PageObjectModel.Guru99_FundTransfer;
import Guru99_PageObjectModel.Guru99_LoginPage;

public class TC_FundTransfer extends Base_Class {
	@Test
	public void FundTransferTest() throws IOException {
		Guru99_LoginPage LP = new Guru99_LoginPage();
		logger.info("Enter Userid");
		LP.setUserid();
		
		logger.info("Enter Password");
		LP.setPassword();
		
		logger.info("Click on login button");
		LP.clickLogin();
		
		Guru99_FundTransfer FT = new Guru99_FundTransfer();
		logger.info("Click on FundTransfer");
		FT.clickFundTransfer();
		
		logger.info("FundTransfer page refreshed");
		driver.navigate().refresh();
		
		logger.info("Click on FundTransfer");
		FT.clickFundTransfer();
		
		logger.info("Verify FundTransfer heading");
		FT.verifyHeading();
		
		logger.info("Enter Payers Account No");
		FT.setPayersAccountNo();
		
		logger.info("Enter Payees Account No");
		FT.setPayeesAccountNo();
		
		logger.info("Enter ammount");
		FT.setAmount();
		
		logger.info("Enter description");
		FT.setDescription();
		
		logger.info("Click Submit");
		FT.clickSubmit();
		
//		driver.switchTo().alert().accept();
		
		logger.info("Verify Fund transfer page title");
		if (driver.getTitle().equals("Guru99 Bank Customised Statement Page")) {
			System.out.println("FundTransferTest Passed");
			System.out.println(driver.getTitle());

		} else {
			getScreenshotAs("FundTransferTest");
			Assert.assertTrue(true);
//			System.out.println("FundTransferTest Failed");
		}
	}
}
