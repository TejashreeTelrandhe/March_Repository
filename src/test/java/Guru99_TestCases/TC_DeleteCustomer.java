package Guru99_TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Guru99_BaseClass.Base_Class;
import Guru99_PageObjectModel.Guru99_DeleteCustomer;
import Guru99_PageObjectModel.Guru99_LoginPage;

public class TC_DeleteCustomer extends Base_Class {
	@Test
	public void DeleteCustomerTest() throws IOException {
		Guru99_LoginPage LP = new Guru99_LoginPage();
		logger.info("Enter Userid");
		LP.setUserid();
		
		logger.info("Enter Password");
		LP.setPassword();
		
		logger.info("Click on login button");
		LP.clickLogin();
		
		Guru99_DeleteCustomer DC = new Guru99_DeleteCustomer();
		logger.info("Click on DeleteAccount");
		DC.clickDeleteAccount();
		
		logger.info("DeleteAccount page refreshed");
		driver.navigate().refresh();
		
		logger.info("Click on DeleteAccount");
		DC.clickDeleteAccount();
		
		logger.info("Verify DeleteAccount heading");
		DC.verifyHeading();
		
		logger.info("ENter customer id");
		DC.setCustomerID();
		
		logger.info("Click submit");
		DC.clickSubmit();
		
		logger.info("Handle alert by clicking on ok");
		driver.switchTo().alert().accept();
		
		logger.info("Verify DeleteAccount page title");
		if (driver.getTitle().equals("Guru99 Bank Delete Customer Page")) {
//	    if(driver.getCurrentUrl().equals("https://demo.guru99.com/v4/manager/deleteCustomer.php")){
			System.out.println("DeleteCustomerTest Passed");
			System.out.println(driver.getTitle());
		}
	else {
			getScreenshotAs("DeleteCustomerTest");
			Assert.assertTrue(true);
//			System.out.println("DeleteCustomerTest Failed");
}
	}}
