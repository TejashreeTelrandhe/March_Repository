package Guru99_PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Guru99_BaseClass.Base_Class;

public class Guru99_Logout extends Base_Class {
	@FindBy(xpath = "//a[text()=\"Log out\"]")
	WebElement Logout;

	public Guru99_Logout() {
		PageFactory.initElements(driver, this);
	}

	public void clickLogout() {
		Logout.click();
	}

}
