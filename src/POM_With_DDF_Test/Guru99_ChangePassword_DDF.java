package POM_With_DDF_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99_ChangePassword_DDF {

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

	public Guru99_ChangePassword_DDF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickChangePassword() {
		ChangePassword.click();
	}

	public void verifyHeading() {
		System.out.println(Heading.getText());
	}

	public void setOldPassword(String OLD) {
		OldPassword.sendKeys(OLD);
	}

	public void setNewPassword(String NEW) {
		NewPassword.sendKeys(NEW);
	}

	public void setConfirmPassword(String CONFIRM) {
		ConfirmPassword.sendKeys(CONFIRM);
	}

	public void clickSubmit() {
		Submit.click();
	}
}
