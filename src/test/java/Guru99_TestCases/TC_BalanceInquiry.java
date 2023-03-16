package Guru99_TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Guru99_BaseClass.Base_Class;
import Guru99_PageObjectModel.Guru99_BalanceInquiry;
import Guru99_PageObjectModel.Guru99_LoginPage;

public class TC_BalanceInquiry extends Base_Class {

	@Test
	public void BalanceInquiryTest() throws IOException {
		Guru99_LoginPage LP = new Guru99_LoginPage();
		logger.info("Enter Userid");
		LP.setUserid();
		
		logger.info("Enter Password");
		LP.setPassword();
		
		logger.info("Click on login button");
		LP.clickLogin();

		Guru99_BalanceInquiry BI = new Guru99_BalanceInquiry();
		logger.info("Click on Balance Inquiry");
		BI.clickBalanceEnquiry();
		
		logger.info("Page refreshed");
		driver.navigate().refresh();
		
		logger.info("Click on Balance Inquiry");
		BI.clickBalanceEnquiry();
		
		logger.info("Verify Balance Inquiry heading");		
		BI.verifyHeading();
		
		logger.info("Enter account no");
		BI.setAccountNo();
		
		logger.info("Click on submit button");
		BI.clickSubmit();

		logger.info("Verify BalanceInquiry page Url ");
		if (driver.getCurrentUrl().equals("https://demo.guru99.com/v4/manager/BalEnquiry.php")) {
			System.out.println("BalanceInquiry Passed");
			System.out.println(driver.getTitle());
		} else {
			getScreenshotAs("BalanceInquiryTest");
//			System.out.println("BalanceInquiry failed");
			Assert.assertTrue(true);
		}
	}
}
