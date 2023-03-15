package Com.internetbanking.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.internetbanking.BaseClass.BaseClass;
import Com.internetbanking.Pageobject.Internetbanking_LoginPage;
import Com.internetbanking.Pageobject.TC_NewAccount_003;

public class TC_AccountCreation_003 extends BaseClass {

	@Test
	public void AddNewAccount() throws InterruptedException, IOException {
		logger.info("URL is opened");

		Internetbanking_LoginPage LP = new Internetbanking_LoginPage();

		LP.Setusername(username);
		logger.info("Enter username");

		LP.SetPassword(password);
		logger.info("Enter Passsword");

		LP.Clickbtn();

		TC_NewAccount_003 NewAcount = new TC_NewAccount_003();

		NewAcount.Account();
		Thread.sleep(2000);
		logger.info("Click on NewAccount tab");

		driver.navigate().refresh();
		NewAcount.Account();

//		NewAcount.AccountNumber("41986");
		NewAcount.AccountNumber("76168");
		logger.info("Enter Customer nuuber");

		Thread.sleep(2000);

		NewAcount.AccountDeposit("3000");
		logger.info("Enter deposit value");
		NewAcount.Submit();
		logger.info("Click on submit button");

		boolean Test = driver.findElement(By.xpath("//p[@class=\"heading3\"]")).isDisplayed();

		if (Test == true) {
			logger.info("Account created");
			Assert.assertTrue(true);
		} 
		else {
			getScreenshotAs("NewAccount");
			logger.info("Account creation failed");
			Assert.assertTrue(false);
		}
		
		if (Isalertpresent() == true) {
			driver.switchTo().alert().accept(); // popup close
			driver.switchTo().defaultContent();
			Assert.assertTrue(true);
			logger.info("Login failed");

		} else {

			Assert.assertTrue(true);
			logger.info("Login passed");
			LP.Logoutapplication();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
	}

	public boolean Isalertpresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}

	}
	}

