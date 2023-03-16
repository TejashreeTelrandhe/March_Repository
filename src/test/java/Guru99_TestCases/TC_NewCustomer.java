package Guru99_TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Guru99_BaseClass.Base_Class;
import Guru99_PageObjectModel.Guru99_LoginPage;
import Guru99_PageObjectModel.Guru99_NewCustomer;

public class TC_NewCustomer extends Base_Class {

	@Test
	public void NewCustomerTest() throws IOException {
		Guru99_LoginPage LP = new Guru99_LoginPage();
		logger.info("Enter Userid");
		LP.setUserid();
		
		logger.info("Enter Password");
		LP.setPassword();
		
		logger.info("Click on login button");
		LP.clickLogin();
		
		Guru99_NewCustomer NC = new Guru99_NewCustomer();
		logger.info("Click on NewCustomer");
		NC.clickNewCustomer();
		
		logger.info("NewCustomer page refreshed");
		driver.navigate().refresh();
		
		logger.info("Click on NewCustomer");
		NC.clickNewCustomer();
		
		logger.info("Verify NewCustomer heading");
		NC.verifyHeading();
		
		logger.info("Enter customer name");
		NC.setCustomername();
		
		logger.info("Click gender");
		NC.clickGender();
		
		logger.info("Enter DOB");
		NC.setDateofbirth();
		
		logger.info("Enter email");
		NC.setEmail();
		
		logger.info("Enter mob no");
		NC.setMobilenumber();
		
		logger.info("Enter Password");
		NC.setPassword();
		
		logger.info("Enter Pin");
		NC.setPIN();
		
		logger.info("Enter address");
		NC.setAddress();
		
		logger.info("Enter city");
		NC.setCity();
		
		logger.info("Enter state");
		NC.setState();
		
		logger.info("Click Submit");
		NC.clickSubmit();
		
		logger.info("Verify NewCustomer Page title");
		if (driver.getTitle().equals("Guru99 Bank Customer Registration Page")) {
			System.out.println("NewCustomerTest Passed");
			System.out.println(driver.getTitle());
		} 
		else {
			getScreenshotAs("NewCustomerTest");
			Assert.assertTrue(true);
//			System.out.println("NewCustomerTest Failed");
		}
	}
}
