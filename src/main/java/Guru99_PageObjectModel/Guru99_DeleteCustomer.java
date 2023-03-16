package Guru99_PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Guru99_BaseClass.Base_Class;

public class Guru99_DeleteCustomer extends Base_Class{
	@FindBy(xpath = "//a[text()=\"Delete Customer\"]")
	WebElement DeleteAccount;

	@FindBy(xpath = "//p[@class=\"heading3\"]")
	WebElement Heading;

	@FindBy(name = "cusid")
	WebElement CustomerID;

	@FindBy(name = "AccSubmit")
	WebElement Submit;

	public Guru99_DeleteCustomer() {
		PageFactory.initElements(driver, this);
	}

	public void clickDeleteAccount() {
		DeleteAccount.click();
	}

	public void verifyHeading() {
		System.out.println(Heading.getText());
	}

	public void setCustomerID() {
		CustomerID.sendKeys("49798");
	}

	public void clickSubmit() {
		Submit.click();
	}
}
