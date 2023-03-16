package Guru99_PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Guru99_BaseClass.Base_Class;

public class Guru99_ChangePassword extends Base_Class{

	@FindBy(xpath = "//a[text()=\"Change Password\"]")
	WebElement ChangePassword;

	@FindBy(xpath = "//p[@class=\"heading3\"]")
	WebElement Heading;

	@FindBy(name = "oldpassword")
	WebElement OldPassword;

	@FindBy(name = "newpassword")
	WebElement NewPassword;

	@FindBy(name = "confirmpassword")
	WebElement ConfirmPassword;

	@FindBy(name = "sub")
	WebElement Submit;

	public Guru99_ChangePassword() {
		PageFactory.initElements(driver, this);
	}

	public void clickChangePassword() {
		ChangePassword.click();
	}

	public void verifyHeading() {
		System.out.println(Heading.getText());
	}

	public void setOldPassword() {
		OldPassword.sendKeys(Pass);
	}

	public void setNewPassword() {
		NewPassword.sendKeys("$elliN3");
	}

	public void setConfirmPassword() {
		ConfirmPassword.sendKeys("$elliN3");
	}

	public void clickSubmit() {
		Submit.click();
	}
}
