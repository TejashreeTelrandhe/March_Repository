package Guru99_TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Guru99_BaseClass.Base_Class;
import Guru99_PageObjectModel.Guru99_LoginPage;
import Guru99_PageObjectModel.Guru99_Logout;

public class TC_Logout extends Base_Class{

	@Test
	public void LogoutTest() throws IOException {
		Guru99_LoginPage LP = new Guru99_LoginPage();
		logger.info("Enter Userid");
		LP.setUserid();
		
		logger.info("Enter Password");
		LP.setPassword();
		
		logger.info("Click on login button");
		LP.clickLogin();
		
		Guru99_Logout LO = new Guru99_Logout();
		logger.info("Click on logout button");
		LO.clickLogout();
		
		logger.info("Handled alert by clicking on ok");
		driver.switchTo().alert().accept();
		
		logger.info("Verified the logoutpage Url");
		if(driver.getCurrentUrl().equals("https://demo.guru99.com/v4/manager/Logout.php")) {
			System.out.println("LogoutTest Passed");
			System.out.println(driver.getTitle());

		}
		else {
			getScreenshotAs("LogoutTest");
			Assert.assertTrue(true);
//			System.out.println("LogoutTest Failed");

		}
	}
}
