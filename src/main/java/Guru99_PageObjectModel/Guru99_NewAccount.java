package Guru99_PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Guru99_BaseClass.Base_Class;

public class Guru99_NewAccount extends Base_Class {
	@FindBy(xpath = "//a[text()=\"New Account\"]")
	WebElement NewAccount;

	@FindBy(xpath = "//p[@class=\"heading3\"]")
	WebElement Heading;

	@FindBy(name = "cusid")
	WebElement CustomerId;

	@FindBy(name = "inideposit")
	WebElement InitialDeposit;

	@FindBy(name = "button2")
	WebElement Submit;

	public Guru99_NewAccount() {
		PageFactory.initElements(driver, this);
	}

	public void clickNewAccount() {
		NewAccount.click();
	}

	public void verifyHeading() {
		System.out.println(Heading.getText());
	}

	public void setCustomerId() {
		CustomerId.sendKeys("65368");
	}

	public void setInitialDeposit() {
		InitialDeposit.sendKeys("3000");
	}

	public void clickSubmit() {
		Submit.click();
	}
}
