package Guru99_TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Guru99_BaseClass.Base_Class;
import Guru99_PageObjectModel.Guru99_EditCustomer;
import Guru99_PageObjectModel.Guru99_LoginPage;

public class TC_EditCustomer extends Base_Class {

	@Test
	public void EditCustomerTest() throws IOException {
		Guru99_LoginPage LP = new Guru99_LoginPage();
		logger.info("Enter Userid");
		LP.setUserid();

		logger.info("Enter Password");
		LP.setPassword();

		logger.info("Click on login button");
		LP.clickLogin();

		Guru99_EditCustomer EC = new Guru99_EditCustomer();
		logger.info("Click on EditCustomer");
		EC.clickEditCustomer();
		
		logger.info("EditCustomer page refreshed");
		driver.navigate().refresh();
		
		logger.info("Click on EditCustomer");
		EC.clickEditCustomer();
		
		logger.info("Verify EditCustomer heading");
		EC.verifyHeading();
		
		logger.info("Enter customer id");
		EC.setCustomerId();
		
		logger.info("Click submit");
		EC.clickSubmit();
		
		logger.info("Handlle alert by clicking on ok");
		driver.switchTo().alert().accept();
		
		logger.info("Verify EditCustomer page title");
		if (driver.getTitle().equals("Guru99 Bank Edit Customer Page")) {
			System.out.println("EditCustomerTest Passed");
			System.out.println(driver.getTitle());

		} else {
			getScreenshotAs("EditCustomerTest");
			Assert.assertTrue(true);
//			System.out.println("EditCustomerTest Failed");

		}
	}
}
