package Guru99_PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Guru99_BaseClass.Base_Class;

public class Guru99_Withdrawal extends Base_Class{
	@FindBy(xpath = "//a[text()=\"Withdrawal\"]")
	WebElement Withdrawal;

	@FindBy(xpath = "//p[@class=\"heading3\"]")
	WebElement Heading;

	@FindBy(name = "accountno")
	WebElement AccountNo;

	@FindBy(name = "ammount")
	WebElement Amount;

	@FindBy(name = "desc")
	WebElement Description;

	@FindBy(name = "AccSubmit")
	WebElement Submit;

	public Guru99_Withdrawal() {
		PageFactory.initElements(driver, this);
	}

	public void clickWithdrawal() {
		Withdrawal.click();
	}

	public void verifyHeading() {
		System.out.println(Heading.getText());
	}

	public void setAccountNo() {
		AccountNo.sendKeys("119397");
	}

	public void setAmount() {
		Amount.sendKeys("100");
	}

	public void setDescription() {
		Description.sendKeys("Fees");
	}

	public void clickSubmit() {
		Submit.click();
	}
}
