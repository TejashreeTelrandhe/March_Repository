package Guru99_PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Guru99_BaseClass.Base_Class;

public class Guru99_DeleteAccount extends Base_Class {
//	@FindBy(xpath = "//a[text()=\"Delete Account\"]")
	@FindBy(xpath = "//a[text()=\"Delete Account\"]")
	WebElement DeleteAccount;

	@FindBy(xpath = "//p[@class=\"heading3\"]")
	WebElement Heading;

	@FindBy(name = "accountno")
	WebElement AccountNo;

	@FindBy(name = "AccSubmit")
	WebElement Submit;

	public Guru99_DeleteAccount() {
		PageFactory.initElements(driver, this);
	}

	public void clickDeleteAccount() {
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("arguments[0].click()", DeleteAccount);
//		DeleteAccount.click();
	}

	public void verifyHeading() {
		System.out.println(Heading.getText());
	}

	public void setAccountNo() {
		AccountNo.sendKeys("119087");
	}

	public void clickSubmit() {
		Submit.click();
	}
}
