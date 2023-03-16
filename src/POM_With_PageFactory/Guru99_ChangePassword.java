package POM_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99_ChangePassword {

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

	public Guru99_ChangePassword(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickChangePassword() {
		ChangePassword.click();
	}

	public void verifyHeading() {
		System.out.println(Heading.getText());
	}

	public void setOldPassword() {
		OldPassword.sendKeys("UqEryra");
	}

	public void setNewPassword() {
		NewPassword.sendKeys("AbCdefg");
	}

	public void setConfirmPassword() {
		ConfirmPassword.sendKeys("AbCdefg");
	}

	public void clickSubmit() {
		Submit.click();
	}
}
